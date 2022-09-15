import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupController {

    @FXML
    private Button bttnsup;

    @FXML
    private Hyperlink lnkLgn;

    @FXML
    private TextField txtfldcno;

    @FXML
    private TextField txtfldemail;

    @FXML
    private TextField txtfldname;

    @FXML
    private PasswordField txtfldpsswd;

    static File myFile2 = new File("Userdata.txt");

    @FXML
    void buttonSignUp(ActionEvent event) {

        if (txtfldname.getText().isEmpty() || txtfldpsswd.getText().isEmpty() || txtfldemail.getText().isEmpty() || txtfldcno.getText().isEmpty()) {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error message");
            a.setContentText("You have not entered any of the value. Please check it again.");
            a.show();  
        }
        else
        {
            try 
        {
            
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myFile2,true))); // to open file in write mode
            String name = txtfldname.getText();
            String cno = txtfldcno.getText();
            String email = txtfldemail.getText();
            String passwd = txtfldpsswd.getText();

            output.println(name+"|"+cno+"|"+email+"|"+passwd+"|");

            txtfldname.clear();
            txtfldpsswd.clear();
            txtfldcno.clear();
            txtfldemail.clear();
               
            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information message");
            a.setContentText("Thank you for registering with us.");
            a.showAndWait().ifPresent(response -> {
                if(response==ButtonType.OK)
                {
                    App.showStage1();
                }
            });
           
           
       
          
           
            output.close();
            } 
            
        catch (IOException e) // to catch the exception and to avoid program from crashing.
        {
            System.out.println("error in file read"+e.getMessage());
        } 
        catch(InputMismatchException e) // to catch the exception and to avoid program from crashing.
        {
            System.out.println("invalid input"+e.getMessage());
        } 
    }

    }

    @FXML
    void lnkLogin(ActionEvent event) {


        App.showStageLogin();
    }

}
