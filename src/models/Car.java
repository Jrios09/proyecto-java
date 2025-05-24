package models;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car () {}

    public Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getmake() {
        return make;
    }
    public String getmodel() {
        return model;
    }
    public int getyear() {
        return year;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }


    public void displayInfo(){
        System.err.println("Car Information:");
        System.err.println("make: " + make);
        System.err.println("model: " + model);
        System.err.println("year: " + year);
    }

}
