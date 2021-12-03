package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Receipt_Controller {
	
	  Ladies a = Ladies.getObject();
	  
	  @FXML
	  Label nameLabel;
	  @FXML
	  Label addLabel;
	  @FXML
	  Label conLabel;
	  @FXML
	  Label dateLabel;	  
	  @FXML
	  Label Cost;
	  @FXML
	  Label DeliveryCharge;
	  @FXML
	  Label Total;
	  @FXML
	  Label expressDelivery;
	  
	  @FXML
	  private Button saved;
	  @FXML
	  private AnchorPane scenePane;
	  
	  
	  
	  int del = 20;
	  int total = del + Ladies.Price + Ladies.expressDeliveryCharge;
	  
	  private Stage stage;
	  private Scene scene;
	  private Parent root;
	  
	  
	  public void Refresh(ActionEvent event) throws IOException {
		  nameLabel.setText(Ladies.CustomerName);
		  addLabel.setText(Ladies.CustomerAddress);
		  conLabel.setText(String.valueOf(Ladies.CustomerPhoneNumber));
		  dateLabel.setText(String.valueOf(Ladies.CustomerDeliveryDate));
		  Cost.setText(String.valueOf(Ladies.Price));
		  DeliveryCharge.setText(String.valueOf(del));
		  expressDelivery.setText(String.valueOf(Ladies.expressDeliveryCharge));
		  Total.setText(String.valueOf(total));
	 }
	  
	  public void save(ActionEvent event) throws IOException {
		  
		  Alert alert = new Alert(AlertType.CONFIRMATION);
		  alert.setTitle("Complete");
		  alert.setHeaderText("You will no longer be able to change the information provided!");
		  alert.setContentText("Do you want to save and continue?");
		  
		  if(alert.showAndWait().get() == ButtonType.OK) {
		     stage = (Stage) scenePane.getScene().getWindow();
		     System.out.println("You have successfully completed your order.");
		     stage.close();
		  }
	 }
	  

	  public void Back(ActionEvent event) throws IOException {
		  root = FXMLLoader.load(getClass().getResource("Contact_Details.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }


}