package mycodes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        System.out.println("Circle with radius: " + radius);
        return "";
    }



}
