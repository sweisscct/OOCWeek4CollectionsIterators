/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsiterators;

import java.util.Arrays;

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
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(true, "Blue", 8);
        Box box1 = new Box();
        Sphere sphere1 = new Sphere();
        
        String[] names = {"Sam", "Sean", "Jessica"};
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        
        String[] colours = new String[5];
        System.out.println(Arrays.toString(colours));
        // Remember: Java starts counting from 0
        colours[1] = "Red";
        System.out.println(Arrays.toString(colours));
    }
}
