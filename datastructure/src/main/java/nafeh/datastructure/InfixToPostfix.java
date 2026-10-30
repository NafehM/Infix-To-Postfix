/**
 * 
 */
package nafeh.datastructure;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author NMM-PC
 *
 */
public class InfixToPostfix extends Application {
	Pane root = new Pane();
	Scene scene = new Scene(root, 800,600);
	Label outputLabel = new Label();
	
	Label outLabel = new Label();
	TextField inTextField = new TextField();
	Button submitButton = new Button();
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setScene(scene);
		primaryStage.show();
		outputLabel.setText("Hello");
		root.getChildren().add(outputLabel);
	}

}
