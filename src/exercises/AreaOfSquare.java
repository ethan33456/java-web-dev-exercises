package exercises;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of Rectangle:");
        int length = input.nextInt();
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Width of Rectangle:");
        int width = input.nextInt();
        int area = width * length;
        System.out.println("Area of Rectangle: " + area);
    }
}
