package com.example.comp1008st1178551test2;

import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> inventory;

    public Dealership(){
        this.inventory=new ArrayList<Car>();
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public double getInventoryValue(){
        double sum=0;
        for(int i=0; i<inventory.size();i++){
            sum += inventory.get(i).getPrice();
        }
        return sum;
    }
}
