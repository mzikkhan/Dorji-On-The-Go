package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BaseController {
	
	 private Stage stage;
	 private Scene scene;
	 private Parent root;

	public void Fitting(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("FittingChooseClothing.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	
	public void Customise(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("CustomizeChooseMaterialDesign.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	
}