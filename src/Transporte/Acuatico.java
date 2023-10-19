/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Acuatico, es una subclase de la clase MediosTransporte
 * @author Luis Hernández
 */
public class Acuatico extends MediosTransporte {
    private String direccion, material, tipo;

    /**
     * Constructor vacio
     */
    public Acuatico() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Acuatico
     * @param direccion direccion del medio de transporte acuatico
     * @param material material del que esta hecho el medio de transporte acuatico
     * @param tipo tipo, maritico o fluvial del medio de transporte acuatico
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Acuatico(String direccion, String material, String tipo, float peso, String color, String tam) {
        super(peso, color, tam);
        this.direccion = direccion;
        this.material = material;
        this.tipo = tipo;
    }

    /**
     * Metodo get, devuelve la direccion del medio de transporte acuatico
     * @return direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo set, modifica la direccion del medio de transporte acuatico
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo get, devuelve el material del medio de transporte acuatico
     * @return meterial
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Metodo set, modifica el material del medio de transporte acuatico
     * @param material 
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Metodo get, devuelve el tipo del medio de transporte acuatico
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo set, modifica el tipo del medio de transporte acuatico
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void frenar(){
        System.out.println("El transporte acuatico debe frenar con anticipacion");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void trasladar(){
        System.out.println("Este transporte actualmente transporta a mercancias");
    }
    
    /**
     * Metodo sobreescrito avanzar, ya que este metodo lo tiene la superclase MediosTransporte
     */
    @Override
    public void avanzar(){
        System.out.println("Rumbo a "+direccion);
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de la superclase
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Acuatico{" + "direccion=" + direccion + ", material=" + material + ", tipo=" + tipo +' '+super.toString()+ '}';
    }
}
