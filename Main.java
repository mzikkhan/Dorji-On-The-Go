package application;
 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import java.io.*;

public class Main extends Application {
	
 
	 @Override
	 public void start(Stage stage) {
		  try {
			   
			   Parent root = FXMLLoader.load(getClass().getResource("Base.fxml"));
			   Scene scene = new Scene(root);
			   
			   
			   stage.setTitle("Dorji On The Go");
			   stage.setScene(scene);
			   stage.show();
		   
		  } catch(Exception e) {
		   e.printStackTrace();
		  }
	 }
	 
	 public static void main(String[] args) throws Exception {
		  launch(args);
		  Ladies a = Ladies.getObject();
		 
		  
		  if(Ladies.counter == 4) {
			  File o = new File("UpperFitting.txt");
			  
			  try {
				  if(o.exists()){
						System.out.println("File exists");	
				   }else {
						o.createNewFile();
						System.out.println("File does not exist");
				   }
						
				File file = new File("UpperFitting.txt");
			    FileWriter output1 = new FileWriter(o, true);
						  
				output1.write( a.getTypeOfClothing() + " " );
				output1.write( a.getShoulderWidth() + " " );
				output1.write( a.getNeckSize() + " " );
			    output1.write( a.getArmLength() + " " );
				output1.write( a.getArmSize() + " " );
				output1.write( a.getWaistLength() + " " );
				output1.write( a.getTorsoLength() + " " );
				output1.write( a.getNeckDepth() + " " );
				output1.write( a.getBackLength() + " " );
				output1.write( a.getArmScye() + " " );
				output1.write( a.getLengthOfGarment() + " " );
				output1.write( a.getBackSize() + " " );
					    
			    output1.write( Ladies.CustomerName+" ");
			    output1.write( Ladies.CustomerPhoneNumber+" ");
				output1.write( Ladies.CustomerAddress+" ");
				output1.write( Ladies.CustomerEmailAddress+" ");
				output1.write( Ladies.CustomerBkashNumber+" ");
			    output1.write( Ladies.CustomerDeliveryDate+" \n");
						
						
				output1.close();
			  }catch(IOException t) {
				  System.out.println("File error");
			  }
			  
           }else if(Ladies.counter == 5) {
        	   
        	    File o = new File("LowerFitting.txt");
        	    try {
					if(o.exists()){
						System.out.println("File exists");
					}else {
						 o.createNewFile();
						System.out.println("File does not exist");
					}
					
					  File file = new File("LowerFitting.txt");
					  FileWriter output = new FileWriter(o, true);
					
					  output.write(Ladies.getObject().getTypeOfClothing()+" ");
				      output.write(Ladies.getObject().getHipLength() +" ");
				      output.write(Ladies.getObject().getWaistLength()+" ");
				      output.write(Ladies.getObject().getLengthOfGarment()+" ");
				      output.write(Ladies.getObject().getInSeam()+" ");
				      output.write(Ladies.getObject().getThigh() +" ");
				  
				      output.write( Ladies.CustomerName+" ");
				      output.write( Ladies.CustomerPhoneNumber+" ");
				      output.write( Ladies.CustomerAddress+" ");
				      output.write( Ladies.CustomerEmailAddress+" ");
				      output.write( Ladies.CustomerBkashNumber+" ");
				      output.write( Ladies.CustomerDeliveryDate+" \n");
					
					  output.close();
        	    }catch(IOException t){
        	    	System.out.println("File error");
        	    }
		     
		      
	        }else if(Ladies.counter == 2) {
	              File o = new File("UpperCustomising.txt");
				  
				  try {
						if(o.exists()){
							System.out.println("File exists");
						}else {
							o.createNewFile();
							System.out.println("File does not exist");
						}
						
						File file = new File("UpperCustomising.txt");
						FileWriter output = new FileWriter(o, true);
						
						  output.write(a.getClothingMaterial()+" ");
						  output.write(a.getTypeOfDesign()+" ");
						  output.write(a.getTypeOfClothing()+" ");
					      output.write(a.getShoulderWidth() +" ");
					      output.write(a.getNeckSize()+" ");
					      output.write(a.getArmLength()+" ");
					      output.write(a.getArmSize()+" ");
					      output.write(a.getWaistLength()+" ");
					      output.write(a.getTorsoLength()+" ");
					      output.write(a.getNeckDepth()+" ");
					      output.write(a.getBackLength()+" ");
					      output.write(a.getArmScye()+" ");
					      output.write(a.getLengthOfGarment()+" ");
					      output.write(a.getBackSize()+" ");
					      
					      output.write( Ladies.CustomerName+" ");
					      output.write( Ladies.CustomerPhoneNumber+" ");
					      output.write( Ladies.CustomerAddress+" ");
					      output.write( Ladies.CustomerEmailAddress+" ");
					      output.write( Ladies.CustomerBkashNumber+" ");
					      output.write( Ladies.CustomerDeliveryDate+" \n");
						
						
						output.close();
					}
					catch(IOException t) {
						System.out.println("File error");
					}
	            } else {
	            	
		            	File o = new File("LowerCustomising.txt");
		        	    try {
							if(o.exists()){
								System.out.println("File exists");
							}else {
								 o.createNewFile();
								System.out.println("File does not exist");
							}
							
							File file = new File("LowerCustomsing.txt");
							 FileWriter output = new FileWriter(o, true);
							
							  output.write(a.getClothingMaterial()+" ");
							  output.write(a.getTypeOfDesign()+" ");
							  output.write(a.getTypeOfClothing()+" ");
						      output.write(a.getHipLength()+" ");
						      output.write(a.getWaistLength()+" ");
						      output.write(a.getLengthOfGarment()+" ");
						      output.write(a.getInSeam()+" ");
						      output.write(a.getThigh() +" ");
						  
						      output.write( Ladies.CustomerName+" ");
						      output.write( Ladies.CustomerPhoneNumber+" ");
						      output.write( Ladies.CustomerAddress+" ");
						      output.write( Ladies.CustomerEmailAddress+" ");
						      output.write( Ladies.CustomerBkashNumber+" ");
						      output.write( Ladies.CustomerDeliveryDate+" \n");
							
							  output.close();
		        	    }catch(IOException t){
		        	    	System.out.println("File error");
		        	    }
		      }
	   }   
}