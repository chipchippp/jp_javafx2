package db2java2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    public static void main(String[] args)  {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("lab1.fxml"));
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.setTitle("T2210A JavaFX Demo");
        primaryStage.show();
    }
}
