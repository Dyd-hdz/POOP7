/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Terrestre, es una subclase de la clase MediosTransporte
 * @author Luis Hernández
 */
public class Terrestre extends MediosTransporte {
    private String direccion,lugarOrigen;
    private float duracionViaje;

    /**
     * Constructor vacio
     */
    public Terrestre() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Terrestre
     * @param direccion direccion del medio de transporte terrestre
     * @param lugarOrigen lugar de origen del medio de transporte terrestre
     * @param duracionViaje duraccion del viaje del medio de transporte terrestre
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Terrestre(String direccion, String lugarOrigen, float duracionViaje,float peso, String color, String tam) {
        super(peso,color,tam);
        this.direccion = direccion;
        this.lugarOrigen = lugarOrigen;
        this.duracionViaje = duracionViaje;
    }

    /**
     * Metodo get, devuelve la direccion del medio de transporte terrestre
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo set, modifica la direccion del medio de transporte terrestre
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo get, devuelve el lugar de origen del medio de tansporte terrestre
     * @return 
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Metodo set, modifica el lugar de origen del medio de tansporte terrestre
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Metodo get, devuelve la duraccion del viaje del medio de tansporte terrestre
     * @return 
     */
    public float getDuracionViaje() {
        return duracionViaje;
    }

    /**
     * Metodo set, modifica la duraccion de viaje del medio de tansporte terrestre
     * @param duracionViaje 
     */
    public void setDuracionViaje(float duracionViaje) {
        this.duracionViaje = duracionViaje;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void msj(){
        System.out.println("Trata de evitar frenar de manera brusca");
    }
    
    /**
     * Metodo sobreescrito encender, ya que este metodo lo tiene la superclase MediosTasnporte
     */
    @Override
    public void encender(){
        System.out.println("El motor empieza a calentarse");
    }
    
    /**
     * Metodo sobreescrito encender, ya que este metodo lo tiene la superclase MediosTasnporte
     */
    @Override
    public void apagar(){
        System.out.println("El motor empieza a perder calor");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de la superclase
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Terrestre{" + "direccion=" + direccion + ", lugarOrigen=" + lugarOrigen + ", duracionViaje=" + duracionViaje + ' '+super.toString()+'}';
    }
}
