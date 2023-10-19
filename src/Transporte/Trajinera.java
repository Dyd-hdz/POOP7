/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Trajinera, es una subclase de la clase Acuatico
 * @author Luis Hernández
 */
public class Trajinera extends Acuatico {
    private int nPasajeros, nTrajineros;
    private float tiempo;

    /**
     * Constructor vacio
     */
    public Trajinera() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Trajinera
     * @param nPasajeros numero de pasajeros de la trajinera
     * @param nTrajineros numero de trajineros de la trajinera
     * @param tiempo el tiempo que tarde el viaje de la trajinera
     * Atributos de la clase Acuatico
     * @param direccion direccion del medio de transporte acuatico
     * @param material material del que esta hecho el medio de transporte acuatico
     * @param tipo tipo, maritico o fluvial del medio de transporte acuatico
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Trajinera(int nPasajeros, int nTrajineros, float tiempo, String direccion, String material, String tipo, float peso, String color, String tam) {
        super(direccion, material, tipo, peso, color, tam);
        this.nPasajeros = nPasajeros;
        this.nTrajineros = nTrajineros;
        this.tiempo = tiempo;
    }

    /**
     * Metodo get, devuelve el numero de pasajeros de la trajinera
     * @return nPasajeros
     */
    public int getnPasajeros() {
        return nPasajeros;
    }

    /**
     * Metodo set, modifica el numero de pasajeros de la trajinera
     * @param nPasajeros 
     */
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    /**
     * Metodo get, devuelve el numero de trajineros de la trajinera
     * @return nTrajineros
     */
    public int getnTrajineros() {
        return nTrajineros;
    }

    /**
     * Metodo set, modifica el numero de trajineros de la trajinera
     * @param nTrajineros 
     */
    public void setnTrajineros(int nTrajineros) {
        this.nTrajineros = nTrajineros;
    }

    /**
     * Metodo get, devuelve el tiempo de la trajinera
     * @return tiempo
     */
    public float getTiempo() {
        return tiempo;
    }

    /**
     * Metodo set, modifica el tiempo de la trajinera
     * @param tiempo 
     */
    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void detener(){
        System.out.println("La trajinera esta empezando a detenerse");
    }
    
    /**
     * Metodo que devuelve un mensaje concatenado al parametro recibido
     * @param lado es la direccion a la que gira
     */
    public void girar(String lado){
        System.out.println("La trajinera esta girando de lado "+lado);
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void remar(){
        System.out.println("Los trajineros van a empezar a remar");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Trajinera{" + "nPasajeros=" + nPasajeros + ", nTrajineros=" + nTrajineros + ", tiempo=" + tiempo + ' '+super.toString()+'}';
    }
}
