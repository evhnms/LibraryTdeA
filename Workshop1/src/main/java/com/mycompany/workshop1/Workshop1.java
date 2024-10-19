/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.workshop1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Workshop1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int option;
    System.out.print("""
                     Seleccione la opci\u00f3n que desee realizar 
                     1.Conversi\u00f3n temperatura
                     2.Calculo de IMC
                     3.Juego de adivinanza
                     4. Calculadora de notas
                     5. }sistema de calificaciones\n
                     """);
    option = entrada.nextInt();
    System.out.print("Ha seleccionado la opción:" + option + "\n"
            + "");
    switch(option) {
        case 1 -> {
            int Celsius; 
            System.out.print("Digite la temperatura en Celsius");
            Celsius = entrada.nextInt();
            float Fahrenheit = (Celsius * 9/5) + 32;
            float Kelvin = (float) (Celsius + 273.15);
            if(Celsius >= 0){
                System.out.print("La temperatura en grados Fahrenheit es: " + Fahrenheit +"°F "
                 + "y en grados Kelvin es:" + Kelvin + "°K");
            }
            else {
                System.out.print("Temperatura ingresada no es valida");
            }
            }
        case 2 ->{
            float height;
            float weight;
            System.out.print("Digite la altura del usuario: ");
            height = entrada.nextInt();
            System.out.print("Digite el peso del usuario: ");
            weight = entrada.nextInt(); 
            float IMC = weight/(height*height);
            System.out.print("El IMC del usuarios es: "+ IMC);
        }
        case 3 -> { 
            int number = (int)(Math.random()*100+1);
            int guessNumber;
            System.out.print("Digita el número que crees que es el correcto: ");
            guessNumber = entrada.nextInt();
            if(guessNumber == number){
                System.out.print("Has adivinado el número" + guessNumber);
            }
            else {
                System.out.print("Has fallado el número correcto es: " + number);
            }
        }
        case 4 ->{
            float Math;
            float Biology;
            float Art;
            System.out.print("""
                             Digite las notas correspondientes en el siguiente orden: 
                             1. Maths2. Biology3. Art""");
            Math = entrada.nextInt();
            Biology = entrada.nextInt();
        Art = entrada.nextInt();
        float average = (Math + Biology + Art )/3;
        System.out.print("El promedio es:" +  average);
}
        case 5 ->{
            float note;
            System.out.print("Digite una nota:");
            note = entrada.nextInt();
            if(note >= 0.0 && note <= 3.0) {
                System.out.print("La nota es F");
            }
            else if(note >=3.1 && note <= 3.9){
                System.out.print("La nota es una D");
             
            }
            else if (note >= 4.0 && note <=4.4){
            System.out.print("La nota es una C");
        }
            else if (note >= 4.5 && note <=4.7){
                System.out.print("La nota es una B");
                
            }
            else if (note >= 4.8 && note <= 5.0){
                System.out.print("La nota es una A");
            }
            else{
                System.out.print("La nota ingresada no es valida");
            }
            }
    }
    }
}
