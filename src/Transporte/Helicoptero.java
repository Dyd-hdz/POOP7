/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Helicoptero, es una subclase de la clase Aereo
 * @author Luis Hernández
 */
public class Helicoptero extends Aereo {
    private int nHelices, modelo, nPasajeros;

    /**
     * Constructor vacio
     */
    public Helicoptero() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Helicoptero
     * @param nHelices numero de helices del helicoptero
     * @param modelo modelo del helicoptero
     * @param nPasajeros numero de pasajeros del helicoptero
     * Atributos de la clase Aereo
     * @param lugarOrigen lugar de origen del medio de transporte aereo
     * @param direccion direccion a la que se dirige el medio de transporte aereo
     * @param durancionViaje duracion de viaje del medio de transporte aereo
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Helicoptero(int nHelices, int modelo, int nPasajeros, String lugarOrigen, String direccion, int durancionViaje, float peso, String color, String tam) {
        super(lugarOrigen, direccion, durancionViaje, peso, color, tam);
        this.nHelices = nHelices;
        this.modelo = modelo;
        this.nPasajeros = nPasajeros;
    }

    /**
     * Metodo get, devuelve el numero de helices del helicoptero
     * @return nHelices
     */
    public int getnHelices() {
        return nHelices;
    }

    /**
     * Metodo set, modifica el numero de helices del helicoptero
     * @param nHelices 
     */
    public void setnHelices(int nHelices) {
        this.nHelices = nHelices;
    }

    /**
     * Metodo get, devuelve el modelo del helicoptero
     * @return modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Metodo set, modifica el modelo del helicoptero
     * @param modelo 
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo get, devuelve el numero de pasajeros del helicoptero
     * @return nPasajeros
     */
    public int getnPasajeros() {
        return nPasajeros;
    }

    /**
     * Metodo set, modifica el numero de pasajeros del helicoptero
     * @param nPasajeros 
     */
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    /**
     * Metodo que devuelve un mensaje
     */
    public void girarHelices(){
        System.out.println("Las helices estan empezando a girar");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void ascender(){
        System.out.println("Esta empezando a ascender");
    }
    
    /**
     * Metodo sobreescrito descender, ya que este metodo lo tiene la superclase Aereo
     */
    @Override
    public void descender(){
        System.out.println("Reducir la velocidad de las helices hace que el helicoptero descienda");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Helicoptero{" + "nHelices=" + nHelices + ", modelo=" + modelo + ", nPasajeros=" + nPasajeros + ' '+super.toString()+'}';
    }
}
