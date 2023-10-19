/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Barco, es una subclase de la clase Acuatico
 * @author Luis Hernández
 */
public class Barco extends Acuatico {
    private int nPasajeros, nPersonal, nCuartos;
    
    /**
     * Constructor vacio
     */
    public Barco() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Barco
     * @param nPasajeros numero de pasajeros del barco
     * @param nPersonal numero del personal del barco
     * @param nCuartos numero de cuartos del barco
     * Atributos de la clase Acuatico
     * @param direccion direccion del medio de transporte acuatico
     * @param material material del que esta hecho el medio de transporte acuatico
     * @param tipo tipo, maritico o fluvial del medio de transporte acuatico
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Barco(int nPasajeros, int nPersonal, int nCuartos, String direccion, String material, String tipo, float peso, String color, String tam) {
        super(direccion, material, tipo, peso, color, tam);
        this.nPasajeros = nPasajeros;
        this.nPersonal = nPersonal;
        this.nCuartos = nCuartos;
    }

    /**
     * Metodo get, devuelve el numero de pasajeros del barco
     * @return nPasajeros
     */
    public int getnPasajeros() {
        return nPasajeros;
    }

    /**
     * Metodo set, modifica el numero de pasajeros del barco
     * @param nPasajeros 
     */
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    /**
     * Metodo get, devuelve el numero de personal del barco
     * @return nPersonal
     */
    public int getnPersonal() {
        return nPersonal;
    }

    /**
     * Metodo set, modifica el numero de personal del barco
     * @param nPersonal 
     */
    public void setnPersonal(int nPersonal) {
        this.nPersonal = nPersonal;
    }

    /**
     * Metodo get, devuelve el numero de cuartos del barco
     * @return nCuartos
     */
    public int getnCuartos() {
        return nCuartos;
    }

    /**
     * Metodo set, modifica numero de cuartos del barco
     * @param nCuartos 
     */
    public void setnCuartos(int nCuartos) {
        this.nCuartos = nCuartos;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void navegar(){
        System.out.println("El barco esta navegando tranquilamente");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void lanzarAncla(){
        System.out.println("Lanzar ancla");
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void alertar(){
        System.out.println("Se ve un iceberg a la vista");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Barco{" + "nPasajeros=" + nPasajeros + ", nPersonal=" + nPersonal + ", nCuartos=" + nCuartos +' '+super.toString()+ '}';
    }
}
