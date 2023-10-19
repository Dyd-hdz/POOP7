/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Subterraneo, es una subclase de la clase Terrestre
 * @author Luis Hernández
 */
public class Subterraneo extends Terrestre {
    private String combustible, ruta, llantaRiel;

    /**
     * Constructor vacio
     */
    public Subterraneo() {
    }

    /**
     * Constructor lleno
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
    public Subterraneo(String combustible, String ruta, String llantaRiel, String direccion, String lugarOrigen, float duracionViaje, float peso, String color, String tam) {
        super(direccion, lugarOrigen, duracionViaje, peso, color, tam);
        this.combustible = combustible;
        this.ruta = ruta;
        this.llantaRiel = llantaRiel;
    }

    /**
     * Metodo get, devuelve el combustible del medio de transporte subterraneo
     * @return combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Metodo set, modifica el combustible del medio de transporte subterraneo
     * @param combustible 
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * Metodo get, devuelve la ruta del medio de transporte subterraneo
     * @return ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Metodo set, modifica la ruta del medio de transporte subterraneo
     * @param ruta 
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * Metodo get, devuelve la llanta o riel del medio de transporte subterraneo
     * @return llantaRiel
     */
    public String getLlantaRiel() {
        return llantaRiel;
    }

    /**
     * Metodo set, modifica la llanta o riel del medio de transporte subterraneo
     * @param llantaRiel 
     */
    public void setLlantaRiel(String llantaRiel) {
        this.llantaRiel = llantaRiel;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void parar(){
        System.out.println("Esperar a que suban los pasajeros");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void luces(){
        System.out.println("Las luces seran prendidas");
    }
    
    /**
     * Metodo que devuelve un mensaje concatenado al parametro recibido
     * @param estacion La estacion a la que va a llegar
     */
    public void mensaje(String estacion){
        System.out.println("La proxima estacion es "+estacion);
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Subterraneo{" + "combustible=" + combustible + ", ruta=" + ruta + ", llantaRiel=" + llantaRiel +' '+super.toString()+ '}';
    }
}
