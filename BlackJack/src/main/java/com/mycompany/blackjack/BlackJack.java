/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjack;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;


public class BlackJack {

    static Card[] deck = new Card[52];

    public static void main(String[] args) {
        buildDeck();

        menu();
        
        Scanner input = new Scanner(System.in);       
        int option = input.nextInt();
 
        int score = 0;
        
        do { 
            switch (option) {
                case 1:
                    Card card = pickCard();
                    score += card.getValue();
                    System.out.println("    Your card: " + card.toString());
                    System.out.println("    Your current score: " + score);
                    break;
                case 2: 
                    System.out.println("    YOU WERE HOLDED! ");
                    System.out.println("    Your score: " + score);
                    break;
                case 3:
                    System.out.println("BYE BYE!");
                    break;
                default:
                    System.out.println("[ERROR] WRONG OPTION!!! ");
            }
            
            if (score >= 21 || option >= 2) {
                System.out.println("------ GAME ENDED ------");
                System.out.println("    Your current score: " + score);
                break;
            }else{
                menu();
                option = input.nextInt();
            }  
        } while (option != 3);
    }
    
    public static void buildDeck(){
        int index = 0;
        for (int i = 0; i < Card.SUITES.length; i++) {
            String suit = Card.SUITES[i];
            for (int j = 0; j < Card.TYPES.length; j++) {
                String type = Card.TYPES[j];
                deck[index] = new Card(cardValue(type), type, suit);
                index++;
            }
        }
    }
    
    public static int cardValue(String cardType){
        if (cardType == "A") {
            return 11;
        }
        if (cardType == "J" || cardType == "Q" || cardType == "K") {
            return 10;
        }
        
        return Integer.parseInt(cardType);
    }
    
    public static Card pickCard(){
        int deckRandomIndex = (int) (Math.random() * deck.length);
        
        System.out.println(deckRandomIndex);
        
        return deck[deckRandomIndex];
    }
    
    public static void menu(){
        System.out.println("------------------");
        System.out.println(" BLACK JACK GAME ");
        System.out.println("------------------");
        System.out.println("1. Pick a Card");
        System.out.println("2. Hold");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
    }
}