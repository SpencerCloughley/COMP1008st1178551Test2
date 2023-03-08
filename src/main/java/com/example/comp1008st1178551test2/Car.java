package com.example.comp1008st1178551test2;

public class Car {
    private String make;
    private String model;
    private double price;
    private int year;

    public Car(String make, String model, double price, int year){
        setMake(make);
        setModel(model);
        setPrice(price);
        setYear(year);
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        //would be more ideal to turn this into a list/array of valid makes and run through instead of hard coding
        //could also add it to the thrown exception

        //Checks for Values that look like "This"
        make=make.substring(0,1).toUpperCase() + make.substring(1).toLowerCase();
        if(make.equals("Ford") ||  make.equals("Honda") || make.equals("Nissan") )
            this.make = make;
        else{
            //Changes to all uppercase to look for values like "THIS"
            make=make.toUpperCase();
            if(make.equals("GMC") || make.equals("BMW"))
                this.make=make;
            else
                throw new IllegalArgumentException("Incorrect make entered, must be one of: Ford, GMC, Honda, Nissan, BMW");
        }

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        //until I can verify, "characters cannot be blank" is being considered as NO blank characters allowed
        if(model.length()>=2 && !model.contains(" "))
            this.model = model;
        else
            throw new IllegalArgumentException("Incorrect model entered, must be at least 2 characters long and cannot be blank");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0 && price<=150000)
            this.price = price;
        else
            throw new IllegalArgumentException("Incorrect price entered, must be between 0 and 150000 inclusive");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1900 && year<=2023)
            this.year = year;
        else
            throw new IllegalArgumentException("Incorrect year entered, must be between 1900 and 2023 inclusive");
    }

    public String toString(){
        return year + " " + make + " " + model + " $%.2f" + price;
    }
}
