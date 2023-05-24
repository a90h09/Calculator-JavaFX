import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Parent root;
        try 
        {
        root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Cal");
        primaryStage.show();
        }
        catch(Exception e)
        {
        System.out.println("Error");
        }
    }   

    public static void main(String[] args) {
        launch(args);
    }
}
