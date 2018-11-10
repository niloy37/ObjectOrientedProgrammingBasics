/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author NSUIT-LAB
 */
public class Person {

private String nationality;
private String name;
private int age;


public void setNationality(String nationality){
    this.nationality = nationality;
}
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age=age;
    }
public String getNationality(){
    return nationality;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}

public String speak(){
    return name+" "+nationality+" "+age;
}
public void sayGender(){
    
    System.out.println("Male");
}
    Person(String name,String nationality,int age){
        this.name=name;
        this.nationality=nationality;
        this.age=age;
    }
    Person(){
        name=null;
        nationality=null;
        age=0;
    }
}
