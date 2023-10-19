/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Suburbano, es una subclase de la clase Subterraneo
 * @author Luis Hernández
 */
public class Suburbano extends Subterraneo {
    private int nPasajeros, nVagones;
    private float vel;

    /**
     * Constructor vacio
     */
    public Suburbano() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Suburbano
     * @param nPasajeros numero de pasajeros del suburbano
     * @param nVagones numero de vagones del suburbano
     * @param vel velocidad del suburbano
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
    public Suburbano(int nPasajeros, int nVagones, float vel, String combustible, String ruta, String llantaRiel, String direccion, String lugarOrigen, float duracionViaje, float peso, String color, String tam) {
        super(combustible, ruta, llantaRiel, direccion, lugarOrigen, duracionViaje, peso, color, tam);
        this.nPasajeros = nPasajeros;
        this.nVagones = nVagones;
        this.vel = vel;
    }

    /**
     * Metodo get, devuelve el numero de pasajeros del suburbano
     * @return nPasajeros
     */
    public int getnPasajeros() {
        return nPasajeros;
    }

    /**
     * Metoso set, modifica numero de pasajeros del suburbano
     * @param nPasajeros 
     */
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    /**
     * Metodo get, devuelve numero de vagones del suburbano
     * @return nVagones
     */
    public int getnVagones() {
        return nVagones;
    }

    /**
     * Metoso set, modifica numero de vagones del suburbano
     * @param nVagones 
     */
    public void setnVagones(int nVagones) {
        this.nVagones = nVagones;
    }

    /**
     * Metodo get, devuelve la velocidad del suburbano
     * @return vel
     */
    public float getVel() {
        return vel;
    }

    /**
     * Metoso set, modifica la velocidad del suburbano
     * @param vel 
     */
    public void setVel(float vel) {
        this.vel = vel;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void abrirPuertas(){
        System.out.println("Las puertas se estan abriendo");
    }
    
    /**
     * Metodo que devuelve un mensaje concatenado al parametro recibido
     * @param estacion es la estacion a la que va llegar 
     */
    public void llegar(String estacion){
        System.out.println("El tren esta llegando a "+estacion);
    }
    
    /**
     * Metodo que devuelve un mensaje concatenado al parametro recibido
     * @param estacion es la estacion a la que va a llegar
     */
    public void sonar(String estacion){
        System.out.println("Proxima estacion "+estacion);
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Suburbano{" + "nPasajeros=" + nPasajeros + ", nVagones=" + nVagones + ", vel=" + vel +  ' '+super.toString()+'}';
    }
}
