/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsiterators;

/**
 *
 * @author Sam
 */
public class Box extends Shape implements ThreeDim {
    private double length;
    private double width;
    private double height;
    
    public Box() {
        super();
        this.length = 2;
        this.width = 3;
        this.height = 5;
    }
    
    @Override
    public double calculateArea() {
        return 2*length*width + 2*length*height + 2*width*height;
    }
    
    @Override
    public double calculateVolume() {
        return length*width*height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
