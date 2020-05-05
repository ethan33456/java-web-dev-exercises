package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles Driven:");
        int miles = input.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Gas used (gallons):");
        int gallons = input.nextInt();
        int mpg = miles / gallons;
        System.out.println("MPG: " + mpg);
    }
}
