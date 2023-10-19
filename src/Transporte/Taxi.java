/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Taxi, es una subclase de la clase Supraterraneo
 * @author Luis Hernández
 */
public class Taxi extends Supraterraneo {
    private int modelo, nPuertas;
    private String placas;

    /**
     * Constructor vacio
     */
    public Taxi() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Taxi
     * @param nPuertas numero de puertas del taxi
     * @param modelo modelo del taxi
     * @param placas placas del taxi
     * Atributos de la clase Supraterraeno
     * @param combustible tipo de combustible del medio de transporte supraterraneo
     * @param ruta ruta que sigue el medio de transporte supraterraneo
     * @param nLlantas numero de llantas del medio de transporte supraterraneo
     * Atributos de la clase Terrestre
     * @param direccion direccion del medio de transporte terrestre
     * @param lugarOrigen lugar de origen del medio de transporte terrestre
     * @param duracionViaje duraccion del viaje del medio de transporte terrestre
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Taxi(int nPuertas, int modelo, String placas, String combustible, String ruta, int nLlantas, String direccion, String lugarOrigen, float duracionViaje, float peso, String color, String tam) {
        super(combustible, ruta, nLlantas, direccion, lugarOrigen, duracionViaje, peso, color, tam);
        this.nPuertas = nPuertas;
        this.modelo = modelo;
        this.placas = placas;
    }

    /**
     * Metodo get, devuelve el numero de puertas del taxi
     * @return nPuertas
     */
    public int getnPuertas() {
        return nPuertas;
    }

    /**
     * Metodo set, modifica el numero de puertas del taxi
     * @param nPuertas 
     */
    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    /**
     * Metodo get, devuelve el modelo del taxi
     * @return modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Metodo set, modifica el modelo del taxi
     * @param modelo 
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo get, devuelve la placa del taxi
     * @return placas
     */
    public String getPlacas() {
        return placas;
    }

    /**
     * Metodo set, modifica la placa del taxi
     * @param placas 
     */
    public void setPlacas(String placas) {
        this.placas = placas;
    }

    /**
     * Metodo que devuelve un mensaje
     */
    public void frenar(){
        System.out.println("El taxi esta frenando");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void acelerar(){
        System.out.println("Para ir mas rapido debe de acelerar");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void radio(){
        System.out.println("En la radio esta sonando canciones de Luis Miguel");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Taxi{" + "nPuertas=" + nPuertas + ", modelo=" + modelo + ", placas=" + placas + ' '+super.toString()+ '}';
    }
}
