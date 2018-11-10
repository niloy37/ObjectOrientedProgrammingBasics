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
public class Circle {
      private int radius;
      
      
      
      
      public void setRadius(int radius){
          this.radius=radius;
      }
      public int getRadius(){
          return radius;
      }
      public void area(){
          System.out.println("The area of the circle is "+(Math.PI*(double)radius*radius));
      }
      
      Circle(){
          
      }
      Circle(int radius){
          this.radius=radius;
          
      }
      
      
      
}
