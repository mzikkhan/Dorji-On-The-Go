package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CccController {

	 Ladies a = Ladies.getObject();
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	 public int count = 0;
	 
	 
	 public void Salwar(ActionEvent event) throws IOException {
		  count=2;
		  a.setTypeOfClothing("Salwar");
	 }
	 public void Kameez(ActionEvent event) throws IOException {
		  count=5;
		  a.setTypeOfClothing("Kameez");
	 }
	 public void Saree(ActionEvent event) throws IOException {
		 count=2;
		 a.setTypeOfClothing("Saree");
	 }
	 public void Pyjama(ActionEvent event) throws IOException {
		 count=5;
		 a.setTypeOfClothing("Pyjama");
	 }
	 public void Lehenga(ActionEvent event) throws IOException {
		 count=2;
		 a.setTypeOfClothing("Lehenga");
	 }
	 public void Pants(ActionEvent event) throws IOException {
		 count=5;
		 a.setTypeOfClothing("Pants");
	 }
	 
	 public void Continue(ActionEvent event) throws IOException {
		  if(count == 2) {
			  root = FXMLLoader.load(getClass().getResource("CustomizeMeasurements.fxml"));
		  }else{
			  root = FXMLLoader.load(getClass().getResource("CustomizaMeasurementsB.fxml"));
		  }
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }
	 
	 public void Back(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("CustomizeChooseMaterialDesign.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }
 
}