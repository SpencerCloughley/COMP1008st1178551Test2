package com.example.comp1008st1178551test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class DealershipViewController implements Initializable {

    @FXML
    private Button addCarBtn;

    @FXML
    private ListView<Car> dealershipList;

    @FXML
    private Button defaultBtn;

    @FXML
    private Label expensiveLabel;

    @FXML
    private Label valueLabel;

    @FXML
    void addCar(ActionEvent event) {

    }

    @FXML
    void addDefault(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Dealership spencer = new Dealership();
        Car car1 = new Car("Ford","F150",89002.23,2021);
        Car car2 = new Car("BMW","M3",98723.99,2020);
        Car car3 = new Car("Honda","Accord",32982.12,2022);
        spencer.addCar(car1);
        spencer.addCar(car2);
        spencer.addCar(car3);
    }
}

