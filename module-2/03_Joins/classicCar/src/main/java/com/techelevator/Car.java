package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {

    public static void main(String[] args) {
        Car car = new Car(2008, "Chevy", false);


    }
    private int year;
    private String make;
    private boolean isClassicCar;
    private int age;

    public Car(int year, String make, boolean isClassicCar) {
        this.year = year;
        this.make = make;
        this.isClassicCar = isClassicCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isClassicCar() {
        return isClassicCar;
    }

    public void setClassicCar(boolean isClassicCar) {
        isClassicCar = false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



public boolean eCheckNeeded(int yearToCheck) {
        if (isClassicCar) {
            return false;
        }else if ((year % 2 == 0) && (yearToCheck % 2 == 0)) {
            if (yearToCheck - year  < 25 && yearToCheck - year > 4) {
                return true;
            } else return false;
        }
}
@Override
    public String toString() {
        return "CAR" + getYear() + getMake();
    }
    List<Car> cars = new ArrayList<>();

    final File carFile = new File(car);

       try(Scanner fileReader = new Scanner(carFile)) {
        while(fileReader.hasNextLine()) {
            final String lineOfText = fileReader.nextLine();
            final StringBuilder sb = new StringBuilder(lineOfText);
            System.out.println(sb.reverse().toString());
        }
    } catch {
        System.out.println("file not found");
    }


}
