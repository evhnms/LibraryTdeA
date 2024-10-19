/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplepoo;
 
public class Vehicle {
    //Atributos de la clase
    public String brand;
    public String model;
    public int km;
    private boolean turnOn;
    private int speed;
    private int maxSpeed;
    
    //se crea el constructor 
    //Inicializa los objetos de una clase
    public Vehicle(String _brand, String _model, int _km, int _maxSpeed){
        this.brand = _brand;
        this.model = _model;
        this.km = _km;
        this.maxSpeed = _maxSpeed;
        this.turnOn = false;
        this.speed=0;
    }   
    //Se crean los metos de Set y get 
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
    public int getKm() {
        return km;
    }
 
    public void setKm(int km) {
        this.km = km;
    }
    //Otros metodos
    public void Encender(){
        if(!this.turnOn){
            this.turnOn = true;
            System.out.println("Auto encendido");
        }else{
            System.out.println("El auto ya esta encendido");
        }
    }
    public void Acelerar(){
        if(this.turnOn == true){
            if(this.speed <= this.maxSpeed){
                this.speed +=40;
                System.out.println("La velocidad actual es: " + this.speed);
            }else{
                System.out.println("Se alcanzado la velocidad maxima");
            }            
        }else{
            System.out.println("Primero encienda el auto, no se puede acelelar");
        }
    }
    public void frenar(){
        if(this.turnOn == true && this.speed > 0){
            this.speed -=10;
            System.out.println("La velocidad actual es: " + this.speed);
        }else if (this.speed == 0){
            System.out.println("el auto detenido");
        }
    }
}