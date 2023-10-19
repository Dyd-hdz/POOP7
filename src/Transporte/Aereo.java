/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Aereo, es una subclase de la clase MediosTransporte
 * @author Luis Hernández
 */
public class Aereo extends MediosTransporte {
    private String lugarOrigen,direccion;
    private int durancionViaje;

    /**
     * Constructor vacio
     */
    public Aereo() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Aereo
     * @param lugarOrigen lugar de origen del medio de transporte aereo
     * @param direccion direccion a la que se dirige el medio de transporte aereo
     * @param durancionViaje duracion de viaje del medio de transporte aereo
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Aereo(String lugarOrigen, String direccion, int durancionViaje, float peso, String color, String tam) {
        super(peso, color, tam);
        this.lugarOrigen = lugarOrigen;
        this.direccion = direccion;
        this.durancionViaje = durancionViaje;
    }

    /**
     * Metodo get, devuelve lugar de origen del medio de transporte aereo
     * @return lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Metodo set, modifica el lugar de origen del medio de transporte aereo
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Metodo get, devuelve la direccion del medio de transporte aereo
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo set, modifica la direccion del medio de transporte aereo
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo get, devuelve duracion del viaje del medio de transporte aereo
     * @return duracionViaje
     */
    public int getDurancionViaje() {
        return durancionViaje;
    }

    /**
     * Metodo set, modifica la duraccion del viaje del medio de transporte aereo
     * @param durancionViaje 
     */
    public void setDurancionViaje(int durancionViaje) {
        this.durancionViaje = durancionViaje;
    }

    /**
     * Metodo que devuel un mensaje
     */
    public void volar(){
        System.out.println("Esta empezando a volar");
    }
    
    /**
     * Metodo que devuelve un mensaje concatenado al paremetro recibido
     * @param metros los metros de la altitud a la que viaja el medio de transporte aereo 
     */
    public void altitud(int metros){
        System.out.println("La altitud actual es de: "+metros);
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void descender(){
        System.out.println("Es hora de ir descendiendo para aterrizar");
    }

    /**
     * Metodo sobreescrito, devuelve los atributos de la clase mas la concatenacion de los atributos de la superclase
     * @return 
     */
    @Override
    public String toString() {
        return "Aereo{" + "lugarOrigen=" + lugarOrigen + ", direccion=" + direccion + ", durancionViaje=" + durancionViaje +' '+super.toString()+ '}';
    }
}
