import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EscSeq extends Application {

	// MAIN CLASS
	public static void main(String[] args) {
		launch(args); // Start the JavaFX application by calling launch()

	}

	// START SCENE METHOD
	@Override
	public void start(Stage primaryStage) {

		// Give stage a title
		primaryStage.setTitle("Tell Us about Yourself");

		// Create grid pane
		GridPane grid = new GridPane();

		// Create a scene
		Scene myScene = new Scene(grid, 300, 400);

		// Set the scene on the stage
		primaryStage.setScene(myScene);

		// Create new label
		Label instructionLbl = new Label("Your Name?");
		TextField instructiontxt = new TextField();
		
		Label ageLbl = new Label("Your Age?");
		TextField agetxt = new TextField();
		
		Label emailLbl = new Label("Your Email?");
		TextField emailtxt = new TextField();
		
		Label dobLbl = new Label("Your Date of Birth?");
		TextField dobtxt = new TextField();
					
		Label addressLbl = new Label("Your Address?");
		TextField addresstxt = new TextField();
		
		// Create new text field
		TextField instructionTxt = new TextField();

		// Create new button
		Button calculateBtn = new Button("Calculate");

		calculateBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// heightTxt.getText();
				String instruction = instructiontxt.getText();
				int age = Integer.parseInt(agetxt.getText());
				String email = emailtxt.getText();
				String dob = dobtxt.getText();
				String address = addresstxt.getText();
						
				

				
				primaryStage.setScene(resultScene(primaryStage, age, instruction, email, dob, address)); // Change to new "Scene" (new GUI)

				
			}

		});

		// Layout everything on grid
		grid.add(instructionLbl, 1, 1);
		grid.add(instructiontxt, 2, 1);
		grid.add(ageLbl, 1, 2);
		grid.add(agetxt, 2, 2);
		grid.add(emailLbl, 1, 3);
		grid.add(emailtxt, 2, 3);
		grid.add(dobLbl, 1, 4);
		grid.add(dobtxt, 2, 4);
		grid.add(addressLbl, 1, 5);
		grid.add(addresstxt, 2, 5);
		grid.add(calculateBtn, 1, 6);

		// Show the stage and scene
		primaryStage.show();
	}

	// RESULT SCENE METHOD
	Scene resultScene(Stage primaryStage, int age, String instruction, String email, String dob, String address) {
		GridPane grid = new GridPane();
		
		Label ageLb = new Label("Your age is " + age); 
		grid.add(ageLb, 0, 1);
		
		Label instructionlb = new Label("Your Name is" + instruction); 
		grid.add(instructionlb, 0, 2);
		
		Label emailLb = new Label("Your Email is " + email); 
		grid.add(emailLb, 0, 3);
		
		Label dobLb = new Label("Your Date of Birth is " + dob + " Congrats"); 
		grid.add(dobLb, 0, 4);
		
		Label addressLb = new Label("Your Address is" + address); 
		grid.add(addressLb, 0, 5);
		

		Scene myScene = new Scene(grid, 300, 300);
		return myScene;
	}

}
