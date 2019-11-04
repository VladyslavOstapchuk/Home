package GUI.w11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;
import java.awt.*;


public
    class Main
    extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Group root = new Group();

        Group drawing = new Group();

        Line line = new Line(20, 20, 200, 200);
        line.setStroke(Color.RED);
        line.setStrokeWidth(15);
        line.setStrokeLineCap(StrokeLineCap.ROUND);
        drawing.getChildren().add(line);

        drawing.setLayoutX(120);
        root.getChildren().add(drawing);

        Slider slider = new Slider(0, 200, 0);
        slider.setLayoutX(280);
        slider.setLayoutY(400);

        //slider.valueProperty().bind(drawing.layoutXProperty());
        drawing.layoutXProperty().bind(slider.valueProperty());

        root.getChildren().add(slider);

        Button button = new Button("test");
        button.setOnAction(
                (e)->{
                    System.out.println("tu");
                }
        );
        button.setLayoutX(350);
        button.setLayoutY(400);
        root.getChildren().add(button);

        Scene scene = new Scene( root, 640, 480, Color.DARKGRAY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
