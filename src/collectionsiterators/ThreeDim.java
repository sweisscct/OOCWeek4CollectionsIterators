/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsiterators;

/**
 *
 * @author Sam
 */
public interface ThreeDim {
    public double calculateVolume();
    
    public default void sayHello() {
        System.out.println("Hello!");
    }
}
