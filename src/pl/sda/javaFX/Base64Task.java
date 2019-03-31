package pl.sda.javaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pl.sda.genericTypes.Box;

import java.util.Base64;
import java.util.Observable;

public class Base64Task extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage) {

        TextField textInput = new TextField();
        Button button = new Button("convert to base64");
        Label labelOutput = new Label();


        VBox box = new VBox();
        ObservableList<Node> children = box.getChildren();
        children.addAll(textInput, button, labelOutput);
        primaryStage.setScene(new Scene(box, 300,300));
        primaryStage.show();

    }

//    public String codeBase64 (String input) {
//        Base64 base64 = new Base64.();
    }
//}