/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author NSUIT-LAB
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        Scanner var = new Scanner(System.in);
        
        Circle c1 = new Circle(10);
        Circle c2 = new Circle();
        c1.area();//c1 area
        c2.setRadius(5);
        c2.area();//c2 area
        
        
        
    }
    
}
