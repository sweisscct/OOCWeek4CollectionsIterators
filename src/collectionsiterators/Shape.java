/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsiterators;

/**
 *
 * @author Administrator
 */
public abstract class Shape {
    private boolean isFilled;
    private String colour;
    
    public Shape() {
        this.isFilled = false;
        this.colour = "Yellow";
    }
    
    public Shape(boolean isFilled, String colour) {
        this.isFilled = isFilled;
        this.colour = colour;
    }
    
    public abstract double calculateArea();

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
