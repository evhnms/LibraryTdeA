/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javalearning;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class JavaLearning {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Crea un programa que permita lo valide si un número es menor o mayo al otro, si es así, que imprima números dentro de ese rango
        int largerNumber = 45;
        int lowerNumber = 10;
        int userNumber;
        System.out.println("Please, digit a number lower or equal than 45 but largero equal than 10");
        userNumber = scanner.nextInt();
        
        if(userNumber <= largerNumber && userNumber >=lowerNumber){
            System.out.println("Good job! You're a quick learner.");
            for(int i = userNumber; i<=largerNumber; i++){
                System.out.println(i);
        }
    }
        else{
                System.out.println("Oops! You have entered a number out of range: " + userNumber);
                }
    }
}