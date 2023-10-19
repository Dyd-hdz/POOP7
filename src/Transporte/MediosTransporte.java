/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase MediosTransporte, es la superclase
 * @author Luis Hernández
 */
public class MediosTransporte {
    private float peso;
    private String color, tam;

    /**
     * Constructor vacio
     */
    public MediosTransporte() {
    }

    /**
     * Constructor lleno
     * @param peso pero del medio de transporte
     * @param color color del medio de transporte
     * @param tam tamaño del medio de transporte
     */
    public MediosTransporte(float peso, String color, String tam) {
        this.peso = peso;
        this.color = color;
        this.tam = tam;
    }

    /**
     * Metodo get, devuelve el peso del medio de transporte
     * @return peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Metodo set, modifica el peso del medio de transporte
     * @param peso 
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Metodo get, devuelve el color del medio de transporte
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo set, modifica el color del medio de transporte
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metod get, devuelve el tamaño del medio de transporte
     * @return tam
     */
    public String getTam() {
        return tam;
    }

    /**
     * Metodo set, modifica el tamaño del medio de transporte
     * @param tam 
     */
    public void setTamaño(String tam) {
        this.tam = tam;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void avanzar(){
        System.out.println("Esta empezando el viaje");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void encender(){
        System.out.println("Es hora de ir prendiendo el motor");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void apagar(){
        System.out.println("Es el final del viaje, solo queda apagar");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "MediosTransporte{" + "peso=" + peso + ", color=" + color + ", tama\u00f1o=" + tam + '}';
    }
}
