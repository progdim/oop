package com.company;

public class Care {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Care(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return brand + model +","+ year + " год выпуска,сборка " + country +"," + color +" объем двигателя - "+ engineVolume;
    }
}

