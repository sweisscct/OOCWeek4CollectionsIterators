/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsiterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        
        Rectangle[] rectArray = {rect1, rect2};
        System.out.println(rectArray[0].calculateArea());
        System.out.println(rectArray[1].calculateArea());
        
        System.out.println("Need a better way...");
        
        for (Rectangle rect : rectArray) {
            System.out.println(rect.calculateArea());
        }
        
        ArrayList<Circle> circleArray = new ArrayList<>();
        
        List<String> printQ = new ArrayList<>();
        // use Integer instad of int
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        System.out.println(nums);
        
        printQ.add("Class List");
        printQ.add("Homeworks");
        printQ.add("Cool Map");
        printQ.add("Train Timetable");
        System.out.println(printQ);
        
        printQ.add(0, "QR Code");
        System.out.println(printQ);
        
        printQ.set(3, "Terrible Map");
        System.out.println(printQ);
        
        System.out.println(printQ.size());
        
        printQ.remove(0);
        System.out.println(printQ);
        System.out.println(printQ.size());
        
        printQ.remove("Terrible Map");
        System.out.println(printQ);
        System.out.println(printQ.size());
        
        printQ.add(2,"Sam");
        printQ.add("Sam");
        System.out.println(printQ);
        System.out.println(printQ.size());
        
        printQ.remove("Sam");
        System.out.println(printQ);
        System.out.println(printQ.size());
        
        System.out.println(printQ.get(printQ.size()-2));
        
        System.out.println(printQ.contains("Sam"));
        System.out.println(printQ.contains("Sean"));
        System.out.println(printQ.contains("sam"));
        System.out.println(printQ.contains("Sam "));
        
//        printQ.clear();
//        System.out.println(printQ);
//        System.out.println(printQ.size());

        System.out.println(printQ);
        printQ.forEach(document -> {
            System.out.println(document);
        });
    }
}
