/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsiterators;

/**
 *
 * @author Sam
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        // Super calls the constructor of the super-class, in this case Shape
        super();
        this.radius = 10; 
    }
    
    public Circle(boolean isFilled, String colour, double radius) {
        // We can pass arguments to the super-class constructor
        super(isFilled, colour);
        this.radius = radius;
    }
    
    // The empty calculateArea method from the Shape super-class can be replaced with a custom method for this class
    @Override
    public double calculateArea() {
        return 3.14 * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
