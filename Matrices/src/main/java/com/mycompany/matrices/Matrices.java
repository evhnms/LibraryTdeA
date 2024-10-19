package com.mycompany.matrices;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter of number of cars you want to add: ");
        int addCars = scanner.nextInt();
        scanner.nextLine();
        String[] cars = new String[addCars];
        
        for(int i=0; i<addCars;i++){
            System.out.println("Agruegue el carro n°" + (i + 1) + ": ");
            cars[i] = scanner.nextLine();
        }
        for(String car: cars){
            System.out.print("Cars added:");
            System.out.println(car);
        }
 }
}

   
