package mycodes;

import java.util.Scanner;
import java.util.ArrayList;


public class MainApplication {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of the circle: ");
       int n = scan.nextInt();

       Circle[] circles = new Circle[n];
       Cylinder[] cylinders = new Cylinder[n];

       for (int i = 0; i < n; i++) {
           System.out.print("Enter the radius of the circle: ");
           circles[i] = new Circle(scan.nextDouble());
           System.out.print("Enter the radius and height of the cylinder: ");
           cylinders[i] = new Cylinder(scan.nextDouble(), scan.nextDouble());
       }

       System.out.println("\nResults for Circles:");
       for(int i = 0; i < n; i++){
           System.out.println("\tCircle: ");
           System.out.print(circles[i].toString());
           System.out.printf("Circumference: %.2f\n", circles[i].circumference());
           System.out.printf("Area: %.2f\n", circles[i].area());
       }

        System.out.println("\nResults for Cylinders:");
        for(int i = 0; i < n; i++){
            System.out.println("\tCylinder: ");
            System.out.print(cylinders[i].toString());
            System.out.printf("Surface area: %.2f\n", cylinders[i].surfaceArea());
            System.out.printf("Volume: %.2f\n", cylinders[i].volume());
        }

        scan.close();



    }
}
