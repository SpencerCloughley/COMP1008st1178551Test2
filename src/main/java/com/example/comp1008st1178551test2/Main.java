package com.example.comp1008st1178551test2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("dealership-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Spencer's Dealership!");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("images/car.png")));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}