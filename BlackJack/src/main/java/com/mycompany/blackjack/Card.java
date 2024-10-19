/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;


public class Card {
    
    public static String [] SUITES = {"CORAZON", "DIAMANTE", "PICAS", "TREBOL"};
    public static String [] TYPES ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    private int value;
    private String suite;
    private String type;

    public Card(int value, String suite, String type) {
        this.value = value;
        this.suite = suite;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return "[" + this.type + " " + this.suite + "]";
    }
}