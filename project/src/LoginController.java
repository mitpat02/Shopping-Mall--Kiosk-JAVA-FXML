import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button bttnlgn;

    @FXML
    private Hyperlink lnkSup;

    @FXML
    private PasswordField txtfldpsswd;

    @FXML
    private TextField txtflduname;

    @FXML
    void buttonLogin(ActionEvent event) {

    }

    @FXML
    void lnkSignup(ActionEvent event) {
     App.showStageSignup();
    }

}
