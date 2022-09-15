
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DesignTwoController implements Initializable {

    @FXML
    private Button bttnAdd;

    @FXML
    private Button bttnExt;

    @FXML
    private Button bttnView;

    @FXML
    private ComboBox<String> cmbboxtwo;

    @FXML
    private TextArea txtarea;

    @FXML
    private TextField txtfldTotal;

    @FXML
    private TextField txtfldextotal;

    @FXML
    private TextField txtfldtax;

    //if currency combo box selected -->shows different currency options to make bill
    String[] currency={"CAD","USD","GBP","BTC","INR","AUD"};
    ObservableList<String> crrncy=FXCollections.observableArrayList(currency);


    //if exit clicked --> show confiramtion message to exit the system
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

    //money converter 
    @FXML
    void comboTwo(ActionEvent event) throws FileNotFoundException 
    {
            //us @dollars
            if(cmbboxtwo.getSelectionModel().getSelectedIndex()==1)
            {
                double usd = subtotal * 0.80 ;
                double us1 = usd * 0.13;
                double us1total = usd + us1;
                
             txtfldextotal.setText(String.valueOf(usd));
             txtfldtax.setText(String.valueOf(us1));
             txtfldTotal.setText(String.valueOf(us1total));
            }

            //euro @0.73
            else if(cmbboxtwo.getSelectionModel().getSelectedIndex()==2)
            {
                double gbp = subtotal * 0.73 ;
                double gbp1 = gbp * 0.13;
                double gbp1total = gbp + gbp1;
                
             txtfldextotal.setText(String.valueOf(gbp));
             txtfldtax.setText(String.valueOf(gbp1));
             txtfldTotal.setText(String.valueOf(gbp1total));
            }

            //bitcoin @0.000017
            else if(cmbboxtwo.getSelectionModel().getSelectedIndex()==3)
            {
                double btc = subtotal * 0.000017 ;
                double btc1 = btc * 0.13;
                double btc1total = btc + btc1;
                
             txtfldextotal.setText(String.valueOf(btc));
             txtfldtax.setText(String.valueOf(btc1));
             txtfldTotal.setText(String.valueOf(btc1total));
            
            }

            //inr @60
            else if(cmbboxtwo.getSelectionModel().getSelectedIndex() == 4)
            {
                double inr = subtotal * 60 ;
                double inr1 = inr * 0.13;
                double inr1total = inr + inr1;
                
             txtfldextotal.setText(String.valueOf(inr));
             txtfldtax.setText(String.valueOf(inr1));
             txtfldTotal.setText(String.valueOf(inr1total));
            }

            //australian dollar @1.06
            else if(cmbboxtwo.getSelectionModel().getSelectedIndex() == 5)
            {
                double aud = subtotal * 1.60 ;
                double aud1 = aud * 0.13;
                double aud1total = aud + aud1;
                
             txtfldextotal.setText(String.valueOf(aud));
             txtfldtax.setText(String.valueOf(aud1));
             txtfldTotal.setText(String.valueOf(aud1total));
            }
    }

    //this is show/hide method
    @FXML
    void methodAdd(ActionEvent event) {
        App.showStage1();
    }

    //this is not implemented yet ;will be completed by final submission
    @FXML
    void bttnPrcd(ActionEvent event) 
    {
        App.showstageBill();

    }

    //initialized variable
    Scanner input;
    double subtotal;
    double taxes;
    double total;

    @FXML
    void methodView(ActionEvent event) {
        txtarea.clear();
        txtarea.appendText("Item  |  Price  |  Quantity  |  total\n");
        try 
        {
            //Scanner method is used to  print the data which is written by user in file
            input=new Scanner(DesignController.myFile1); //file in read mode  
            while(input.hasNext()) 
            {
                String s=input.next();
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
                txtarea.appendText(item+" | " +price+" | "+quantity+" | "+indtotal+"\n");
                txtfldextotal.setText(String.valueOf(subtotal));
                txtfldtax.setText(String.valueOf(taxes));
                txtfldTotal.setText(String.valueOf(total));
                scn.close();
            }
            input.close();

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
    


    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
       cmbboxtwo.setItems(crrncy);
       
    
    }

}
