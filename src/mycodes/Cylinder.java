package mycodes;

import java.lang.Math;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString(){
        System.out.println("Cylinder with radius: " + radius + " and height:" + height);
        return "";
    }



}
