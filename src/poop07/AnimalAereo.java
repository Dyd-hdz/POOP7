/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 * Contiene los atributos y metodos de la clase AnimalAereo, es una subclase de la clase Animal
 * @author Luis Hernández
 */
public class AnimalAereo extends Animal {
    private int numeroAlas;

    /**
     * Cosntructor vacio
     */
    public AnimalAereo() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase AnimalAereo
     * @param numeroAlas numeros de alas del animal aereo
     * Atributos de la clase Animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    /**
     * Metodo get, devuelve el numero de alas del animal aereo
     * @return numeroAlas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    /**
     * Metodo set, modifica el numero de alas del animal aereo
     * @param numeroAlas 
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void volar(){
        System.out.println("Estoy volando");
    }
    
    /**
     * Metodo sobreescrito comer, ya que este metodo lo tiene la super clase Animal
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo semillas");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de la superclase
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas +' '+super.toString()+ '}';
    }
}
