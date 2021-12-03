package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CmControllerB {

	 Ladies a = Ladies.getObject();
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	 
	 public void Count() {
		  Ladies.counter = 3;
	 }
	 
	 @FXML
	 TextField HipLength;
	 @FXML
	 TextField WaistLength;
	 @FXML
	 TextField LengthOfGarment;
	 @FXML
	 TextField InSeam;
	 @FXML
	 TextField Thigh;
	 
	 double totalAreaOfGauze;
	 
	 public void Back(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("CustomizeChooseClothing.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }
	 
	 public void Continue(ActionEvent event) throws IOException {
		  Count();
		  
		     a.setHipLength(Double.parseDouble(HipLength.getText()));
			 a.setWaistLength(Double.parseDouble(WaistLength.getText()));
			 a.setLengthOfGarment(Double.parseDouble(LengthOfGarment.getText()));
			 a.setInSeam(Double.parseDouble(InSeam.getText()));
		     a.setThigh(Double.parseDouble(Thigh.getText()));
		     
		     totalAreaOfGauze = (a.getWaistLength()*a.getLengthOfGarment()*2)/ 2160.0;
			 Ladies.Price = Ladies.Price * (int)(Math.ceil(totalAreaOfGauze));
			 
			 switch(a.getTypeOfClothing()) {
			 	case "Saree":
			 		Ladies.Price += 500;
			 		break;
			 	case "Salwar":
			 		Ladies.Price += 400;
			 		break;
			 	case "Kameez":
			 		Ladies.Price += 400;
			 		break;
			 	case "Pyjama":
			 		Ladies.Price += 300;
			 		break;
			 	case "Lehenga":
			 		Ladies.Price += 400;
			 		break;
			 	case "Pants":
			 		Ladies.Price += 400;
			 		break;
			 }
		  
		     root = FXMLLoader.load(getClass().getResource("Contact_Details.fxml"));
			 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			 scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();
	 }
 
}