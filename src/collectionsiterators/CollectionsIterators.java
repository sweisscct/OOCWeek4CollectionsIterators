/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsiterators;

/**
 *
 * @author Administrator
 */
public class CollectionsIterators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(true, "Orange", 2, 3);
        
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1.getColour());
        System.out.println(rect2.getColour());
        System.out.println(Double.toString(rect1.getHeight()));
        System.out.println(rect2.getHeight());
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(true, "Blue", 8);
        System.out.println(circle1.calculateArea());
        System.out.println(circle2.calculateArea());
        
        Box box1 = new Box();
        System.out.println(box1.calculateArea());
        System.out.println(box1.calculateVolume());
        
        Sphere sphere1 = new Sphere();
        System.out.println(sphere1.calculateArea());
        System.out.println(sphere1.calculateVolume());
        
        box1.sayHello();
        sphere1.sayHello();
    }
}
