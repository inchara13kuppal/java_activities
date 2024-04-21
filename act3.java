package activities;

import java.util.Scanner;

class Circle {
    double radius = 1.0;
    public Circle() {
    }
    public double getArea() 
    {
        return Math.PI * radius * radius;
    }
    public double getCircumference() 
    {
        return 2 * Math.PI * radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius() 
    {
        return radius;
    }
}

public class act3 {
    public static void main(String[ ] args) {
        Circle circle = new Circle( );
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble( );
        circle.setRadius(radius);
        System.out.println("Radius: " + circle.getRadius( ));
        System.out.println("Area: " + circle.getArea( ));
        System.out.println("Circumference: " + circle.getCircumference( ));
        scanner.close( );
    }
}

