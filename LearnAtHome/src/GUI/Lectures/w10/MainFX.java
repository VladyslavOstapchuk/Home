package GUI.w10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public
    class MainFX
    extends Application {


    public static void main(String[] args) {
        //Application.launch(args);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(
            getClass().getResource("try.fxml")
        );

        primaryStage.setTitle("Hello JavaFX 8 World!");
        primaryStage.setScene(
            new Scene(root, 300, 275)
        );
        primaryStage.show();
    }
}
