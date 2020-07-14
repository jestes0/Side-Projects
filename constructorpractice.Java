/*
  File: constructorpractice.Java
  Designed By: Johnathan Estes
  Purpose: Practicing constructors by allowing user input to enter in a vehicle model and the year it was made.
*/

import java.util.Scanner;

public class Cars{
  String carModel;
  int carYear;

  public Cars(String model, int year) {
    carModel = model;
    carYear = year;
  }

  public static void main(String []args){

    Cars[] obj = new Cars[10];
    String model = "";
    int year = 0;
    int i = 0;

    Scanner modelName = new Scanner(System.in);  // Creates the Scanner object
    System.out.println("Enter in the car Model.");
     model = modelName.nextLine();  // Read user input
    Scanner myYear = new Scanner(System.in);  // Creates the Scanner object

    do {
      System.out.println("Please enter a valid Year.");

      while (!myYear.hasNextInt()){
        System.out.println("This is not a valid number. Please enter in a valid year.");
        myYear.next();
      }

      year = myYear.nextInt();
    } while (year <= 0);

    obj[0] = new Cars(model, year);
    System.out.println("Car Object 1: ");
    System.out.println("Model: " + model + "Year: " + year);
//System.out.println(newCar.carModel + " " + newCar.carYear);
    i++;
    System.out.println("This printed successfully.");
  }
}
