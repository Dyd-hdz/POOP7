/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Supraterraneo, es una subclase de la clase Terrestre
 * @author Luis Hernández
 */
public class Supraterraneo extends Terrestre {
    private String combustible,ruta;
    private int nLlantas;

    /**
     * Constructor vacio
     */
    public Supraterraneo() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Supraterraneo
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
    public Supraterraneo(String combustible, String ruta, int nLlantas, String direccion, String lugarOrigen, float duracionViaje, float peso, String color, String tam) {
        super(direccion, lugarOrigen, duracionViaje, peso, color, tam);
        this.combustible = combustible;
        this.ruta = ruta;
        this.nLlantas = nLlantas;
    }

    /**
     * Metodo get, devuelve el combustible del medio de transporte supraterraneo
     * @return combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Metodo set, modifica el cosbustible del medio de transporte supraterraneo
     * @param combustible 
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * Metodo get, devuelve la ruta del medio de transporte supraterraneo
     * @return 
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Metodo set, modifica la ruta del medio de transporte supraterraneo
     * @param ruta 
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * Metodo get, devuelve el numero de llantas del medio de transporte supraterraneo
     * @return nLlantas
     */
    public int getnLlantas() {
        return nLlantas;
    }

    /**
     * Metodo set, modifica el numero de llantas del medio de transporte supraterraneo
     * @param nLlantas 
     */
    public void setnLlantas(int nLlantas) {
        this.nLlantas = nLlantas;
    }
    
    /**
     * Metodo que devuelve un mensaje mas la concatenacion del atributo combustible
     */
    public void cargarCombustible(){
        System.out.println("Esta cargando el combustible de tipo: "+combustible);
    }
    
    /**
     * Metodo que devuelve un mensaje concatenado al parametro recibido
     * @param girar lado hacia donde gira 
     */
    public void girar(String lado){
        System.out.println("Esta girando de lado "+lado);
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void luces(){
        System.out.println("Estan encendidas las luces");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Supraterraneo{" + "combustible=" + combustible + ", ruta=" + ruta + ", nLlantas=" + nLlantas + ' '+super.toString()+'}';
    }
}
