package com.vk.id26639136.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/fxml/main.fxml"));
        stage.setTitle("JavaFX Maven Spring");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
