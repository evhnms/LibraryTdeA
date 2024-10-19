/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices;
import java.util.ArrayList;
import java.util.Scanner;

public class myFirsArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many products you want to add?");
        int datanumber = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> productos = new ArrayList<String>(datanumber);
       for(int i = 0; i< datanumber;i++){
           System.out.println("Add product n°: " + (i + 1)+ ": ");
           String product = scanner.nextLine();
           productos.add(product);
       }
       
       for(String producto: productos){
           System.out.println("Products added to shopping cart: ");
           System.out.print(producto);
       }
    }
}
