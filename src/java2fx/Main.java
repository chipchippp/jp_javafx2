package java2fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("homectl.fxml"));
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.setTitle("T2210A JavaFX Demo");
        primaryStage.show();
    }
}
