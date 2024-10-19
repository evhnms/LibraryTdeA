/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;

/**
 *
 * @author Lenovo
 */
public class Test1 {
    public static void main(String[] args) {
        //You can print texts and numbers
        System.out.println("Nojoda!");
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");
        System.out.println(4+5);
        System.out.println(4-5);
        System.out.println(4*5);
        System.out.println(4/5);
        System.out.println(45);
        // How to declare variables in Java
        String carName = "Volvo";
        int myNum = 20;
        final int myNum2 = 39;
        myNum = 15;
        //The following code will generate an error because you can't assign a value to a final variable
        //myNum2 = 25;
        System.out.println(carName);
        System.out.println(myNum);
        System.out.println(myNum2);
        //Variable types
        int myNaturalNumber = 20;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myNaturalNumber);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myText + carName);
        //You can also use + to add a variable to another variable
        // As can be seen in the following code
        String firstName = "Juan";
        String surname = "Vélez";
        String fullName = firstName + surname;
        System.out.println(fullName);
       //But when you are using numbers, the + character works as a mathematical operator
       int x = 12;
       int y = 15;
       System.out.println(x + y);
       //If you need to declare many numeric variables you can do so in single line code (must be of the same type)
       int m = 5, n = 6, o = 50;
       //You can also assign the same value to multiple variables in one line:
       m = n = o = 60;
       System.out.println(m + n + o);
        //I'm just commenting this test code
        //Real-life practices
        int studentID = 1001;
        String studentName = "Juan";
        int studentAge = 16;
        float studentFee = 76.09f;
        char studentGrade = 'C';
        // Now we will see how the variables are printed
        System.out.println("Student data:");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Age:" + studentAge);
        System.out.println("Fee: " + studentFee);
        System.out.println("Grade: " + studentGrade);
        //How to calculate the area of a triangle
        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}
