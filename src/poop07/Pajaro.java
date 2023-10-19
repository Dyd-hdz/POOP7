/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 * Contiene los atributos y metodos de la clase Pajaro, es una subclase de la clase AnimalAereo
 * @author Luis Hernández
 */
public class Pajaro extends AnimalAereo {
    private String tipoPico;

    /**
     * Cosntructor vacio
     */
    public Pajaro() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Pajaro
     * @param tipoPico tipo de pico del pajaro
     * Atributos de la clase AnimalAereo
     * @param numeroAlas numero de alas del animal aereo
     * Atributos de la clase Animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    /**
     * Metodo get, devuelve el tipo de pico del pajaro
     * @return  tipoPico
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Metodo set, modifica el tipo de tipo del pajaro
     * @param tipoPico 
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void recolectarRamas(){
        System.out.println("Esta rama se ve bien");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico +' '+super.toString()+ '}';
    }
}
