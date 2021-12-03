package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FccController {

	 Ladies a = Ladies.getObject();
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	 public int count = 0;
	 
	 
	 public void Salwar(ActionEvent event) throws IOException {
		  count=2;
		  a.setTypeOfClothing("Salwar");
		  Ladies.Price = Ladies.Price + 400;
	 }
	 public void Kameez(ActionEvent event) throws IOException {
		  count=5;
		  a.setTypeOfClothing("Kameez");
		  Ladies.Price = Ladies.Price + 400;
	 }
	 public void Saree(ActionEvent event) throws IOException {
		 count=2;
		 a.setTypeOfClothing("Saree");
		 Ladies.Price = Ladies.Price + 500;
	 }
	 public void Pyjama(ActionEvent event) throws IOException {
		 count=5;
		 a.setTypeOfClothing("Pyjama");
		 Ladies.Price = Ladies.Price + 300;
	 }
	 public void Lehenga(ActionEvent event) throws IOException {
		 count=2;
		 a.setTypeOfClothing("Lehenga");
		 Ladies.Price = Ladies.Price + 400;
	 }
	 public void Pants(ActionEvent event) throws IOException {
		 count=5;
		 a.setTypeOfClothing("Pants");
		 Ladies.Price = Ladies.Price + 400;
	 }
	 
	 public void Continue(ActionEvent event) throws IOException {
		  if(count%2 == 0) {
			  root = FXMLLoader.load(getClass().getResource("FittingMeasurements.fxml"));
		  }else {
			  root = FXMLLoader.load(getClass().getResource("FittingMeasurementsB.fxml"));
		  }
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }
	 
	 public void Back(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("Base.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }
 
}