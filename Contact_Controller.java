package application;


import java.io.IOException;

//import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.temporal.ChronoUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
    


public class Contact_Controller {
	
	Ladies a = Ladies.getObject();
	
	@FXML
    TextField CustomerName;
    @FXML
    TextField CustomerPhoneNumber;
    @FXML
    TextField CustomerAddress;
    @FXML
    TextField CustomerEmailAddress;
    @FXML
    TextField CustomerBkashNumber;
    @FXML
    DatePicker CustomerDeliveryDate;
    @FXML
    Button btnFinish;
    @FXML
    Label pricingLabel;

	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	public void setCustomerDeliveryDate(ActionEvent event) throws IOException {
		Ladies.CustomerDeliveryDate = (LocalDate)(CustomerDeliveryDate.getValue());
		
		LocalDate currentDate = LocalDate.now();
		LocalDate date = currentDate.plus(1, ChronoUnit.WEEKS);
		
		if(date.compareTo(Ladies.CustomerDeliveryDate)>=0) {
			Ladies.Price = 500 + Ladies.Price;
			Ladies.expressDeliveryCharge = 200;
		}
				
		
	 }
	
	public void finish(ActionEvent event) throws IOException {
		  Ladies.CustomerName = CustomerName.getText();

		  Ladies.CustomerPhoneNumber = Integer.parseInt(CustomerPhoneNumber.getText());
	
		  Ladies.CustomerAddress = CustomerAddress.getText();
	
		  Ladies.CustomerEmailAddress = CustomerEmailAddress.getText();
	
		  Ladies.CustomerBkashNumber = Integer.parseInt(CustomerBkashNumber.getText());
		  
		  root = FXMLLoader.load(getClass().getResource("Reciept.fxml"));
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	}
	
	public void Back(ActionEvent event) throws IOException {
		if(Ladies.counter == 2){
		    root = FXMLLoader.load(getClass().getResource("CustomizeMeasurements.fxml"));
		}else if(Ladies.counter == 3){
			root = FXMLLoader.load(getClass().getResource("CustomizaMeasurementsB.fxml"));
		}else if(Ladies.counter == 4){
			root = FXMLLoader.load(getClass().getResource("FittingMeasurements.fxml"));
		}else {
			root = FXMLLoader.load(getClass().getResource("FittingMeasurementsB.fxml"));
		}
		  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		  scene = new Scene(root);
		  stage.setScene(scene);
		  stage.show();
	 }

}