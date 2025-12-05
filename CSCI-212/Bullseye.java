/*
 * name: Bullseye.java
 * author: Lucy Buhayenko
 * date: 04.25.25
 * version: 1.0
 * description: Create a target with a red bullseye at the
    			center. The drawing is made up of 8 filled
				circles of decreasing size, alternating
				black and white, with a common center red
				point.
 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Bullseye extends Application{
	public void start(Stage primaryStage){
		
		
		
		
		//declare and instantiate a root
		Group root = new Group();
		
		//creating color
		Color color = Color.BLACK;
		//the radius starts with 150
		int radius = 150;
		//declare and instanitate the rign withi null
		Circle ring = null;
		
	    //making multiple circles inside of the big circle, to make it bullseye
		for(int i = 0; i < 8; i++) {
			//instantiate the circle
			ring = new Circle(160, 160, radius);
			//color the circle with black
			ring.setFill(color);
			
			//the conditional expression could also be written like this
			//circle.setFill((i==7)? Color.RED : Color.WHITE);
			
			if(i % 2 == 0) {
				color = Color.WHITE;
			}
			else {
				color = Color.BLACK;
			}
			//it will color the ring with either b
			ring.setFill(color);
			
			//makes the radius smaller by 20 units
			radius -= 20;
			
			//add to the root
			root.getChildren().add(ring);
		}
		//makes the center of the bullseye red 
		ring.setFill(Color.RED);
		
		//declare and instantiate a scene, the first parameter should be root
		Scene scene = new Scene(root, 300, 120, Color.CYAN);
		
		//sets title
		primaryStage.setTitle("Bullseye");
		
		primaryStage.setScene(scene);
		//it will show the scene
		primaryStage.show();
		}
}