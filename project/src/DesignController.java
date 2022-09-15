import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.ResourceBundle;



import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;


import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;



public class DesignController implements Initializable{

    @FXML
    private Button bttnClear;

    @FXML
    private Button bttnNext;

    @FXML
    private Button bttnadd;

    @FXML
    private ComboBox<String> combobox;

    @FXML
    private Button exitBttn;

    @FXML
    private ListView<String> lstView;

    @FXML
    private TextField txtfldIteam;

    @FXML
    private TextField txtfldPrice;

    @FXML
    private TextField txtfldQuantity;


    //combo box option from which user can select
    //passed through arraylist 
    String[] catList={"Food","Clothes","Electronics","Personal hygiene","Cars"};
    ObservableList<String> lst1=FXCollections.observableArrayList(catList);

    String[] food={"Bread","Milk","Chips","Cheese","Tomatoes","Onions","Pasta","Potatoes"};
    ObservableList<String> fd=FXCollections.observableArrayList(food);

    String[] cloths={"Jenes","Tshirt","Socks","Shirt","Hoodie","Mask","Skirts","Bomber jacket"};
    ObservableList<String> clts=FXCollections.observableArrayList(cloths);

    String[] electronics={"Iphone 13","TV","PS 5","Macbook pro","Airpods pro","Speaker","Portable Heater","Charger"};
    ObservableList<String> elcts=FXCollections.observableArrayList(electronics);

    String[] personalHygiene={"Bodywash","Shampoo","Body lotion","Fashwash","Hair oil","Nail cutter","Toothbrush","Toothpaste"};
    ObservableList<String> ph=FXCollections.observableArrayList(personalHygiene);

    String[] cars={"Accord","Toyota Camry","Tesla model 3","Tesla model x","Jaguar xf","Porsche cayenne","Audi Q8","BMW x6"};
    ObservableList<String> crs=FXCollections.observableArrayList(cars);

    //after combo box is selected;different option will come
    @FXML
    void cmbbox(ActionEvent event) {
           
        if(combobox.getSelectionModel().getSelectedIndex()==0){
            lstView.setItems(fd);
            lstView.getSelectionModel().selectedIndexProperty().addListener(new InvalidationListener() {
                public void invalidated(javafx.beans.Observable observable) {
                     if(lstView.getSelectionModel().getSelectedIndex()==0)
                     {
                         txtfldIteam.setText("Bread");
                         txtfldPrice.setText("1.67");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==1)
                     {
                         txtfldIteam.setText("Milk");
                         txtfldPrice.setText("3.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==2)
                     {
                         txtfldIteam.setText("Chips");
                         txtfldPrice.setText("2.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==3)
                     {
                         txtfldIteam.setText("Cheese");
                         txtfldPrice.setText("4.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==4)
                     {
                         txtfldIteam.setText("Tometoes(1 lb)");
                         txtfldPrice.setText("3.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==5)
                     {
                         txtfldIteam.setText("Oninos(1 lb)");
                         txtfldPrice.setText("2.67");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==6)
                     {
                         txtfldIteam.setText("Pasta");
                         txtfldPrice.setText("6.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==7)
                     {
                         txtfldIteam.setText("Potatoes(1 lb)");
                         txtfldPrice.setText("5.99");
                     }
                }
                    
            });
            
        }
        else if(combobox.getSelectionModel().getSelectedIndex()==1){
            lstView.setItems(clts);
            lstView.getSelectionModel().selectedIndexProperty().addListener(new InvalidationListener() {
                public void invalidated(javafx.beans.Observable observable) {
                     if(lstView.getSelectionModel().getSelectedIndex()==0)
                     {
                         txtfldIteam.setText("Jenes");
                         txtfldPrice.setText("29.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==1)
                     {
                         txtfldIteam.setText("Tshirt");
                         txtfldPrice.setText("35.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==2)
                     {
                         txtfldIteam.setText("Socks");
                         txtfldPrice.setText("20.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==3)
                     {
                         txtfldIteam.setText("Shirt");
                         txtfldPrice.setText("40.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==4)
                     {
                         txtfldIteam.setText("Hoodiee");
                         txtfldPrice.setText("64.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==5)
                     {
                         txtfldIteam.setText("Mask");
                         txtfldPrice.setText("29.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==6)
                     {
                         txtfldIteam.setText("Heater");
                         txtfldPrice.setText("55.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==7)
                     {
                         txtfldIteam.setText("Charger");
                         txtfldPrice.setText("24.99");
                     }
                }
                    
            });
        }
        else if(combobox.getSelectionModel().getSelectedIndex()==2){
            lstView.setItems(elcts); 
            lstView.getSelectionModel().selectedIndexProperty().addListener(new InvalidationListener() {
                public void invalidated(javafx.beans.Observable observable) {
                     if(lstView.getSelectionModel().getSelectedIndex()==0)
                     {
                         txtfldIteam.setText("Iphone");
                         txtfldPrice.setText("1509.00");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==1)
                     {
                         txtfldIteam.setText("Tv");
                         txtfldPrice.setText("398.00");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==2)
                     {
                         txtfldIteam.setText("PS5");
                         txtfldPrice.setText("789.00");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==3)
                     {
                         txtfldIteam.setText("Macbook");
                         txtfldPrice.setText("2499.00");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==4)
                     {
                         txtfldIteam.setText("Airpods");
                         txtfldPrice.setText("274.00");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==5)
                     {
                         txtfldIteam.setText("Speaker");
                         txtfldPrice.setText("136.00");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==6)
                     {
                         txtfldIteam.setText("Skirts");
                         txtfldPrice.setText("55.99");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==7)
                     {
                         txtfldIteam.setText("jacket");
                         txtfldPrice.setText("110.99");
                     }
                }
                    
            }); 
        }
        else if(combobox.getSelectionModel().getSelectedIndex()==3){
            lstView.setItems(ph);  
            lstView.getSelectionModel().selectedIndexProperty().addListener(new InvalidationListener() {
                public void invalidated(javafx.beans.Observable observable) {
                     if(lstView.getSelectionModel().getSelectedIndex()==0)
                     {
                         txtfldIteam.setText("Bodywash");
                         txtfldPrice.setText("8.47");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==1)
                     {
                         txtfldIteam.setText("Shampoo");
                         txtfldPrice.setText("8.97");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==2)
                     {
                         txtfldIteam.setText("lotion");
                         txtfldPrice.setText("9.97");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==3)
                     {
                         txtfldIteam.setText("Fashwash");
                         txtfldPrice.setText("12.08");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==4)
                     {
                         txtfldIteam.setText("oil");
                         txtfldPrice.setText("9.97");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==5)
                     {
                         txtfldIteam.setText("Nailcutter");
                         txtfldPrice.setText("6.08");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==6)
                     {
                         txtfldIteam.setText("Toothbrush");
                         txtfldPrice.setText("6.97");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==7)
                     {
                         txtfldIteam.setText("Toothpaste");
                         txtfldPrice.setText("8.98");
                     }
                }
                    
            }); 
        }
        else if(combobox.getSelectionModel().getSelectedIndex()==4){
            lstView.setItems(crs);  
            lstView.getSelectionModel().selectedIndexProperty().addListener(new InvalidationListener() {
                public void invalidated(javafx.beans.Observable observable) {
                     if(lstView.getSelectionModel().getSelectedIndex()==0)
                     {
                         txtfldIteam.setText("Accord");
                         txtfldPrice.setText("41335");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==1)
                     {
                         txtfldIteam.setText("Camry");
                         txtfldPrice.setText("40090");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==2)
                     {
                         txtfldIteam.setText("TeslaModel3");
                         txtfldPrice.setText("60000");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==3)
                     {
                         txtfldIteam.setText("Teslax");
                         txtfldPrice.setText("145610");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==4)
                     {
                         txtfldIteam.setText("Jaguarxf");
                         txtfldPrice.setText("61800");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==5)
                     {
                         txtfldIteam.setText("Porsche");
                         txtfldPrice.setText("88900");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==6)
                     {
                         txtfldIteam.setText("AudiQ8");
                         txtfldPrice.setText("85700");
                     }
                     else if(lstView.getSelectionModel().getSelectedIndex()==7)
                     {
                         txtfldIteam.setText("BMWx6");
                         txtfldPrice.setText("85100");
                     }
                }
                    
            }); 
        }

    }

    static File myFile1 = new File("Inventory.txt"); // to create a new object of file.
    

    //this will add product in cart
    @FXML
    void methodAdd(ActionEvent event) {
        if (txtfldQuantity.getText().isEmpty()) 
        {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error message");
            a.setContentText("Please enter the quantity.");
            a.show();  
        } 
        else 
        {
          
        try 
        {
            //printwriter will help in writing value in file
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myFile1,true))); // to open file in write mode
            String item = txtfldIteam.getText();
            double price =Double.parseDouble(txtfldPrice.getText());
            double quantity =Double.parseDouble(txtfldQuantity.getText());

            output.println(item+","+price+","+quantity+",");

            txtfldIteam.clear();
            txtfldPrice.clear();
            txtfldQuantity.clear();
            combobox.setPromptText("--Categories--");;
            lstView.getItems().clear();
           
            output.close();
        } 
        //catch method used handle if exception happens
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

    //clear method will clear the textfield
    @FXML
    void methodClear(ActionEvent event) {
        
            txtfldIteam.clear();
            txtfldPrice.clear();
            txtfldQuantity.clear();
            combobox.getSelectionModel().select(0);
            lstView.getItems().clear();
    }

    //if exit clicked --> show confiramtion message to exit the system
    @FXML
    void methodExit(ActionEvent event) {
        Alert a=new Alert(Alert.AlertType.CONFIRMATION); // new instance of alert to show when user click on exit button.
        a.setTitle("Thank you");  //to set title of exit page
        a.setContentText(" Visit again ! :)"); 
        a.showAndWait().ifPresent(response -> {
            if(response==ButtonType.OK)
            {
                System.exit(0);
            }
        });
    }

    @FXML
    void methodNext(ActionEvent event) {

        if (txtfldIteam.getText().isEmpty() || txtfldPrice.getText().isEmpty() || txtfldQuantity.getText().isEmpty()) {
            App.showStage2();
        }
        else
        {
            try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myFile1,true))); // to open file in write mode
            String item = txtfldIteam.getText();
            double price =Double.parseDouble(txtfldPrice.getText());
            double quantity =Double.parseDouble(txtfldQuantity.getText());

            output.print(item+","+price+","+quantity+",");

            txtfldIteam.clear();
            txtfldPrice.clear();
            txtfldQuantity.clear();
            combobox.getSelectionModel().select(0);
            lstView.getItems().clear();
           
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

           App.showStage2();
        }
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) 
    {    
       combobox.setItems(lst1);
    }
}

