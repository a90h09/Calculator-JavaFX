import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Main {

    @FXML
    private TextField tfTitle;
    @FXML
    private TextField First;
    @FXML
    private TextField Second;

    @FXML
    void Click(ActionEvent event) {
        try {
            int num1;
            int num2;
            
            String title = First.getText();
            String title2 = Second.getText();
            num1 = Integer.parseInt(title);
            num2 = Integer.parseInt(title2);
            int num3 = num1 + num2;
            String title3 = Integer.toString(num3);
            tfTitle.setText(title3);

        } catch (Exception e) {
            tfTitle.setText("Please Enter 2 Values");
            System.out.println("error");
        }

    }

    @FXML
    void Click2(ActionEvent event) {
        try {
            int num1;
            int num2;
            
            String title = First.getText();
            String title2 = Second.getText();
            num1 = Integer.parseInt(title);
            num2 = Integer.parseInt(title2);
            int num3 = num1 - num2;
            String title3 = Integer.toString(num3);
            tfTitle.setText(title3);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @FXML
    void Click3(ActionEvent event) {
        try {
            int num1;
            int num2;
            
            String title = First.getText();
            String title2 = Second.getText();
            num1 = Integer.parseInt(title);
            num2 = Integer.parseInt(title2);
            int num3 = num1 * num2;
            String title3 = Integer.toString(num3);
            tfTitle.setText(title3);
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    @FXML
    void Click4(ActionEvent event) {
        try {
            float num1;
            float num2;
          
            String title = First.getText();
            String title2 = Second.getText();
            num1 = Integer.parseInt(title);
            num2 = Integer.parseInt(title2);
            float num3 = num1 / num2;
            String title3 = Float.toString(num3);
            tfTitle.setText(title3);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }


}
