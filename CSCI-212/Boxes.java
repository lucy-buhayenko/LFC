/*
 * name: Bullseye.java
 * author: Lucy Buhayenko
 * date: 04.25.25
 * version: 1.0
 * description: • Draw a scene containing 50 rectangles in
					random locations.
				• The width and height of each rectangle is
					also randomly selected.
				• The “boxes” are unfilled unless the width
					or height is below a certain threshold (10
					pixels).
					– Narrow boxes are filled with yellow
					– short boxes are filled with green.
					– Stroke - white
				• Scene: 400, 400,Color.BLACK
 */
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Bullseye extends Application{
	public void start(Stage primaryStage){
		
		
		
		
		//declare and instantiate a root
		Group root = new Group();
		
		Recktangle r = new Recktangle();
		
		Random rand = new Random();
		
		Rectangle shape;
		
		//adding 50 rectnagels to the scene
		for(int i = 0; i < 50; i++) {
			
			int x = rand.nextInt();
			int y = rand.nextInt();
			
			
			//generates sa random shape at random point 
			shape = new Rectangle(rand.nextInt(1, 399), rand.nextInt(1, 399), rand.nextInt(1, 400), rand.nextInt(1, 400));
			shape.setStroke(Color.WHITE);
			
			
			if(shape.getHeight() <= 10 || shape.getWidth() <= 10){
				if(shape.getHeight() > shape.getWidth()) {
					shape.setFill(Color.YELLOW);

				}
				else {
					shape.setFill(Color.GREEN);
				}
			}
			
			root.getChildren().add(shape);
		}
		
		
		
		//create a black scene 
		Scene scene = new Scene(root, 400, 400, Color.BLACK);
		
		//sets title
		primaryStage.setTitle("Boxes");
		
		primaryStage.setScene(scene);
		//it will show the scene
		primaryStage.show();
		}
	public static void main(String[] args) {
		launch(args);
	}
}