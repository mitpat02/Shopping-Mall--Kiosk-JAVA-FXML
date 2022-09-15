import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage; 

public class App extends Application { 

    static Stage stage1=new Stage();
    static Stage stage2=new Stage();
    static Stage stagelogin = new Stage();
    static Stage stagesignup = new Stage();
    static Stage stageBill = new Stage();


    public void start(Stage stage) throws IOException
    {
        Parent root1 = FXMLLoader.load(getClass().getResource("Design.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("Designtwo.fxml"));
        Parent login = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Parent Signup = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        Parent bill = FXMLLoader.load(getClass().getResource("Bill.fxml"));

        Scene scene1 = new Scene(root1);
        Scene scene2 = new Scene(root2);
        Scene scenelog = new Scene(login);
        Scene scenesign = new Scene(Signup);
        Scene scenebill = new Scene(bill);

        stage1.setScene(scene1);
        stage2.setScene(scene2);
        stagelogin.setScene(scenelog);
        stagesignup.setScene(scenesign);
        stageBill.setScene(scenebill);
        
         showStageLogin();

        Image img = new Image("logo.png");
        
        stage.getIcons().add(img);
        stage1.getIcons().add(img);
        stage2.getIcons().add(img);
        stagelogin.getIcons().add(img);
        stagesignup.getIcons().add(img);
   

    }
    public static void showStage1()
    {
        stage1.show();
        stage1.setTitle("Purchase system - Kunj | Jaimin | Mit");
        stage2.hide();
        stagelogin.hide();
        stagesignup.hide();
        stageBill.hide();

    }   
    public static void showStage2()
    {
        stage2.show();
        stage2.setTitle("Your order summary");
        stage1.hide();
        stagelogin.hide();
        stagesignup.hide();
        stageBill.hide();
    }

    public static void showStageLogin()
    {
        stagelogin.show();
        stagelogin.setTitle("Login");
        stage2.hide();
        stage1.hide();
        stagesignup.hide();
        stageBill.hide();
    }

    public static void showStageSignup()
    {
        stagesignup.show();
        stagesignup.setTitle("Sign up");
        stage2.hide();
        stage1.hide();
        stagelogin.hide();
        stageBill.hide();
    }
    public static void showstageBill()
    {
        stageBill.show();
        stageBill.setTitle("Bill");
        stage2.hide();
        stage1.hide();
        stagelogin.hide();
        stagesignup.hide();
    }
     public static void main(String[] args) {
            launch(args);
    }
}

