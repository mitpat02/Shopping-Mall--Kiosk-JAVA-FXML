

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

public class Bill {

    @FXML
    private Button btnbill;

    @FXML
    private Button bttnExt;

    @FXML
    private TextArea txtarea;

    static File myFile2 = new File("Userdata.txt");
    Scanner hello;
    double subtotal;
    double taxes;
    double total;
    @FXML
    void bill(ActionEvent event) 
    {
       
        try 
        {
            //Scanner method is used to  print the data which is written by user in file
            hello=new Scanner(DesignController.myFile1); //file in read mode  
            while(hello.hasNext()) 
            {
                String s=hello.next();
                Scanner scn=new Scanner(s);
                scn.useDelimiter(",");
                String item=scn.next();
                double price=scn.nextDouble();
                double quantity=scn.nextDouble();
                double indtotal=quantity*price;
                
               subtotal+=indtotal;
               taxes=subtotal*.13;
               total=subtotal+taxes;

               //here we are printing the result
                txtarea.appendText("ITEM : " +item+ " PRICE : " +price+ " \n QUANTITY : " +quantity+ " TOTAL : " +indtotal+"\n\n ");
                txtarea.appendText(" SUBTOTAL : " +subtotal+ " \n Taxes :"  +taxes+ " \nTotal : " +total+ "\n\n");
                txtarea.appendText("MADE BY MIT | KUNJ | JAIMIN ");
            }
            hello.close();

        }
            

        catch (IOException e) // to catch the exception and to avoid program from crashing.
        {
            System.out.println("error in file read"+e.getMessage());
        } 
        catch(InputMismatchException e)// to catch the exception and to avoid program from crashing.
        {
            System.out.println("invalid input"+e.getMessage());
         } 
        
         
    
    } 

    

    @FXML
    void buttonExit(ActionEvent event) 
    {

 Alert a=new Alert(Alert.AlertType.CONFIRMATION); // new instance of alert to show when user click on exit button.
        a.setTitle("Thank you ");  //to set title of exit page
        a.setContentText(" Visit again ! :)"); 
        a.showAndWait().ifPresent(response -> {
            if(response==ButtonType.OK)
            {
                System.exit(0);
            }
        });


    }

}
