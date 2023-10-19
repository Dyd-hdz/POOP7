/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Metro, es una subclase de la clase Subterraneo
 * @author Luis Hernández
 */
public class Metro extends Subterraneo {
    private int nPasajeros, nVagones, nEstaciones;

    /**
     * Constructor vacio
     */
    public Metro() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Metro
     * @param nPasajeros numero de pasajeros del metro
     * @param nVagones numero de vagones del metro
     * @param nEstaciones numero de estaciones del metro
     * Atributos de la clase Subterraneo
     * @param combustible tipo de combustible del medio de transporte subterraneo
     * @param ruta ruta que sigue del medio de transporte subterraneo
     * @param llantaRiel llanta o riel del medio de transporte subterraneo
     * Atributos de la clase Terrestre
     * @param direccion direccion del medio de transporte terrestre
     * @param lugarOrigen lugar de origen del medio de transporte terrestre
     * @param duracionViaje duraccion del viaje del medio de transporte terrestre
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Metro(int nPasajeros, int nVagones, int nEstaciones, String combustible, String ruta, String llantaRiel, String direccion, String lugarOrigen, float duracionViaje, float peso, String color, String tam) {
        super(combustible, ruta, llantaRiel, direccion, lugarOrigen, duracionViaje, peso, color, tam);
        this.nPasajeros = nPasajeros;
        this.nVagones = nVagones;
        this.nEstaciones = nEstaciones;
    }

    /**
     * Metodo get, devuelve el numero de pasajeros del metro
     * @return nPasajeros
     */
    public int getnPasajeros() {
        return nPasajeros;
    }

    /**
     * Metodo set, modifica numero de pasajeros del metro
     * @param nPasajeros 
     */
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    /**
     * Metodo get, devuelve el numero de vagones del metro
     * @return nVagones
     */
    public int getnVagones() {
        return nVagones;
    }

    /**
     * Metodo set, modifica numero de vagones del metro
     * @param nVagones 
     */
    public void setnVagones(int nVagones) {
        this.nVagones = nVagones;
    }

    /**
     * Metodo get, devuelve numero de estaciones del metro
     * @return nEstaciones
     */
    public int getnEstaciones() {
        return nEstaciones;
    }

    /**
     * Metodo set, modifica numero de estaciones del metro
     * @param nEstaciones 
     */
    public void setnEstaciones(int nEstaciones) {
        this.nEstaciones = nEstaciones;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void girar(){
        System.out.println("Para girar el metro no debe de ir muy rapido");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void emergencia(){
        System.out.println("Al jalar la palanca de emergencia se detiene por completo el metro");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void abrirPuertas(){
        System.out.println("Las puertas se estan abriendo");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Metro{" + "nPasajeros=" + nPasajeros + ", nVagones=" + nVagones + ", nEstaciones=" + nEstaciones + ' '+super.toString()+'}';
    }
}
