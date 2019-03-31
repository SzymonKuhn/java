package pl.sda;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String text = "";
        Label label = new Label("Hello World from JavaFX!");
        Label label2 = new Label("This is my new Label!");
        TextField textField = new TextField(text);

        Button button = new Button("Click me please!");
        button.setOnAction(event ->  System.out.println("Button was finally clicked!"));

        Button button2 = new Button("This is my new button!");
        button2.setOnAction(event -> System.out.println(text));

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, button, label2, textField, button2);

        primaryStage.setTitle("Hello World - JavaFX");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();
    }
}
