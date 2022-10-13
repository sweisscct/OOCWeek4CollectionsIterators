/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsiterators;

/**
 *
 * @author Sam
 */

// Extends means it inherites everything that Shape has
public class Rectangle extends Shape {
    private double height;
    private double width;
    
    public Rectangle() {
        // Super calls the constructor of the super-class, in this case Shape
        super();
        this.height = 10;
        this.width = 5;  
    }
    
    public Rectangle(boolean isFilled, String colour, double height, double width) {
        // We can pass arguments to the super-class constructor
        super(isFilled, colour);
        this.height = height;
        this.width = width;  
    }
    
    // The empty calculateArea method from the Shape super-class can be replaced with a custom method for this class
    @Override
    public double calculateArea() {
        return this.height * this.width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
