/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author NSUIT-LAB
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person p1 = new Person("Niloy","Bangladeshi",20);
        Person p2 = new Person ();
        
        
        p2.setAge(21);
        p2.setName("Rick");
        p2.setNationality("Cameroon");
        
        System.out.println(p1.speak());
        p1.sayGender();
        
        //person 2 
        System.out.println(p2.speak());
                p2.sayGender();
        
        
        // TODO code application logic here
    }
    
}
