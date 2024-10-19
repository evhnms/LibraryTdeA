package com.mycompany.matrices;
import java.util.Scanner;
import java.util.ArrayList;

public class ArraysMixed {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] fruits;
        ArrayList<String> vegetables = new ArrayList<>();
        
        do {
            // Get the number of fruits
            System.out.println("Please, give a number to add to fruits list:");
            int nFruits = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            fruits = new String[nFruits];
            
            // Add fruits
            for(int i = 0; i < nFruits; i++){
                System.out.println("Please add fruit n°" + (i + 1) + ": ");
                fruits[i] = scanner.nextLine();
            }

            // Check if the user wants to add vegetables
            if(fruits.length > 0){
                System.out.println("Now, give the number of vegetables you want to add:");
                int nVegetables = scanner.nextInt();
                scanner.nextLine(); // Consume leftover newline

                // Add vegetables
                vegetables.clear(); // Clear the list for each iteration
                for(int j = 0; j < nVegetables; j++){
                    System.out.println("Please add vegetable n°" + (j + 1) + ": ");
                    String vegetable = scanner.nextLine();
                    vegetables.add(vegetable);
                }
            }

            // Print the fruits and vegetables
            System.out.println("Just added the following fruits:");
            for(String fruit: fruits){
                System.out.println(fruit);
            }

            System.out.println("Good job! You added the following vegetables:");
            for(String vegeta: vegetables){
                System.out.println(vegeta);
            }

        } while(fruits.length > 0 && vegetables.size() > 0);  // Correct use of &&

        scanner.close();
    }
}
