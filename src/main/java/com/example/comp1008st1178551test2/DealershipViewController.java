package com.example.comp1008st1178551test2;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DealershipViewController implements Initializable {

    @FXML
    private TextField makeField;

    @FXML
    private TextField modelField;

    @FXML
    private TextField priceField;

    @FXML
    private TextField yearField;

    @FXML
    private Label errorLabel;
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

    private Dealership currentDealer;

    @FXML
    void addCar(ActionEvent event) {
        int newYear= Integer.parseInt(yearField.getText());
        double newPrice = Double.parseDouble(priceField.getText());
        String newModel = modelField.getText();
        String newMake = makeField.getText();
        try {
            Car temp = new Car(newMake, newModel, newPrice, newYear);
            currentDealer.addCar(temp);
        }catch (Exception e) {
            errorLabel.setText(e.getMessage());
        }
        updateLabels(currentDealer);
    }

    @FXML
    void addDefault(ActionEvent event) {
        yearField.setText("2019");
        makeField.setText("Nissan");
        modelField.setText("Sentra");
        priceField.setText("60234.63");
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
        updateLabels(spencer);
        currentDealer=spencer;
    }

    private void updateLabels(Dealership dealer){
        dealershipList.setItems(FXCollections.observableArrayList(dealer.getInventory()));
        expensiveLabel.setText("The most expensive car is: " + dealer.getMostExpensiveCar().toString());
        valueLabel.setText(dealer.toString());
    }
}

