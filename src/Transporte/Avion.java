/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Avion, es una subclase de la clase Aereo
 * @author Luis Hernández
 */
public class Avion extends Aereo {
    private String aereolina;  
    private int nPasajeros, npersonal;

    /**
     * Constructor vacio
     */
    public Avion() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Avion
     * @param aereolina aereolina del avion
     * @param nPasajeros numero de pasajeros del avion
     * @param npersonal numeros del personal del avion
     * Atributos de la clase Aereo
     * @param lugarOrigen lugar de origen del medio de transporte aereo
     * @param direccion direccion a la que se dirige el medio de transporte aereo
     * @param durancionViaje duracion de viaje del medio de transporte aereo
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Avion(String aereolina, int nPasajeros, int npersonal, String lugarOrigen, String direccion, int durancionViaje, float peso, String color, String tam) {
        super(lugarOrigen, direccion, durancionViaje, peso, color, tam);
        this.aereolina = aereolina;
        this.nPasajeros = nPasajeros;
        this.npersonal = npersonal;
    }

    /**
     * Metodo get, devuelve la aereolina del avion
     * @return aereolina
     */
    public String getAereolina() {
        return aereolina;
    }

    /**
     * Metodo set, modifica la aereolina del avion
     * @param aereolina 
     */
    public void setAereolina(String aereolina) {
        this.aereolina = aereolina;
    }

    /**
     * Metodo get, devuelve el numero de pasajeros del avion
     * @return nPasajeros
     */
    public int getnPasajeros() {
        return nPasajeros;
    }

    /**
     * Metodo set, modifica el numero de pasajeros del avion
     * @param nPasajeros 
     */
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    /**
     * Metodo get, devuelve el numero de personas  del avion
     * @return nPersonal
     */
    public int getNpersonal() {
        return npersonal;
    }

    /**
     * Metodo set, modifica el numero de personal del avion
     * @param npersonal 
     */
    public void setNpersonal(int npersonal) {
        this.npersonal = npersonal;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void disminuirVel(){
        System.out.println("La velocidad esta disminuyendo para tener un un buen aterrizaje");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void acelerar(){
        System.out.println("Empezamos a acelerar un poco");
    }
    
    /**
     * Metodo sobreescrito volar, ya que este metodo lo tiene la superclase Aereo
     */
    @Override
    public void volar(){
        System.out.println("Esta todo listo para empezar a ganar altitud");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Avion{" + "aereolina=" + aereolina + ", nPasajeros=" + nPasajeros + ", npersonal=" + npersonal + ' '+super.toString()+'}';
    }
}
