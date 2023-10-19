/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 * Contiene los atributos y metodos de la clase Ballena, es una subclase de la clase AnimalAcuatico
 * @author Luis Hdz
 */
public class Ballena extends AnimalAcuatico {
    private int largo;

    /**
     * Cosntructor vacio
     */
    public Ballena() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Ballena
     * @param largo longitud de la ballena
     * Atributos de la clase Animal Acuatico
     * @param numeroAletas numero de aletas de la clase animal acuatico
     * Atributos de la clase Animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Ballena(int largo, int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(numeroAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    /**
     * Metodo get, devuelve el largo de la ballena
     * @return largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * Metodo set, modifica el largo de la ballena
     * @param largo 
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void pelearConPinocho(){
        System.out.println("Estoy peleando con Pinocho");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {//el super.toString() es necesario para concatenar con los atributos de la clase super
        return "Ballena{" + "largo=" + largo +' '+ super.toString()+'}';
    }
    
    
}
