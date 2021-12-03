package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CcmdController {

	 Ladies a = Ladies.getObject();
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	 
	 public void chiffon(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Chiffon");
		 Ladies.Price = Ladies.Price + 400;
	 }
	 
	 public void gorgette(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Gorgette");
		 Ladies.Price = Ladies.Price + 300;
	 }
	 
	 public void katan(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Katan");
		 Ladies.Price = Ladies.Price + 200;
	 }
	 
	 public void silk(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Silk");
		 Ladies.Price = Ladies.Price + 700;
	 }
	 
	 public void muslin(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Muslin");
		 Ladies.Price = Ladies.Price + 1200;
	 }
	 
	 public void wool(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Wool");
		 Ladies.Price = Ladies.Price + 200;
	 }
	 
	 public void cotton(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Cotton");
		 Ladies.Price = Ladies.Price + 200;
	 }
	 
	 public void cashmere(ActionEvent event) throws IOException{
		 a.setClothingMaterial("Cashmere");
		 Ladies.Price = Ladies.Price + 900;
	 }
	 
	 public void floralAzalea(ActionEvent event) throws IOException{
		 a.setTypeOfDesign("Floral Azalea");
		 Ladies.Price = Ladies.Price + 100;
	 }
	 
	 public void caratina(ActionEvent event) throws IOException{
		 a.setTypeOfDesign("Caratina");
		 Ladies.Price = Ladies.Price + 100;
	 }
	 
	 public void shamaela(ActionEvent event) throws IOException{
		 a.setTypeOfDesign("Shamaela");
		 Ladies.Price = Ladies.Price + 100;
	 }
	 
	 public void femina(ActionEvent event) throws IOException{
		 a.setTypeOfDesign("Femina");
		 Ladies.Price = Ladies.Price + 100;
	 }
	 
	 public void zaratuga(ActionEvent event) throws IOException{
		 a.setTypeOfDesign("Zaratuga");
		 Ladies.Price = Ladies.Price + 100;
	 }
	 
	 public void latiro(ActionEvent event) throws IOException{
		 a.setTypeOfDesign("Latiro");
		 Ladies.Price = Ladies.Price + 100;
	 }
	 
	 public void Continue(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("CustomizeChooseClothing.fxml"));
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