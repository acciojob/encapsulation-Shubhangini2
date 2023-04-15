package com.driver;

public class Main {
  //create main function in Main.java, and crete an obj of class RWOnly in this file
    public static void main(String args[]){
        RWOnly rw= new RWOnly();

        //setting a value to name, by directly accessing it using obj and also try printing it
        rw.setName("Shubhangini");
        System.out.println(rw.getName());
    }
}