/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */
import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        final double MeterSquareConversionFactor = 0.09290304;
        System.out.println("What is the length of the room in feet?");
        Scanner sc = new Scanner(System.in);
        String LengthFeet = sc.nextLine();
        System.out.println("What is the width of the room in feet?");
        String WidthFeet = sc.nextLine();
        int LengthFeetInt = Integer.parseInt(LengthFeet);
        int WidthFeetInt = Integer.parseInt(WidthFeet);
        System.out.println("You entered dimensions of "+ LengthFeet + " feet by " + WidthFeet + "feet.");
        System.out.println("The area is");

        int SquareFootage = LengthFeetInt * WidthFeetInt;
        double SquareMeters = SquareFootage *  MeterSquareConversionFactor;


        System.out.println(SquareFootage + " square feet");
        System.out.println(SquareMeters + " square meters");


    }
}
