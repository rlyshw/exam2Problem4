package view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
public class PasswordDemoController {
	@FXML
	private PasswordField myPassword;
	@FXML
	private Button OK;
	@FXML
	private Button HELP;
	@FXML
	private Label wrong;
	@FXML
	private Label right;
	
	@FXML
	public void okEvent(){
		System.out.println(myPassword.getText());
		if(myPassword.getText().equals("bugaboo")){
			wrong.setVisible(false);
			right.setVisible(true);
		}
		else{
			right.setVisible(false);
			wrong.setVisible(true);
		}
	}
	@FXML
	public void helpEvent(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Help Dialog");
		alert.setHeaderText(null);
		alert.setContentText("Help was clicked");
		alert.showAndWait();
	}
}
