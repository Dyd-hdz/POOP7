/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 * Contiene los atributos y metodos de la clase AnimalAcuatico, es una subclase de la clase Animal
 * @author Luis Hdz
 */
public class AnimalAcuatico extends Animal {//extends es para referir que esta clase es una subclase de Animal
    private int numeroAletas;

    /**
     * Constructor vacio
     */
    public AnimalAcuatico() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase AnimalAcutico
     * @param numeroAletas Numero de aletas del animal acuatico
     * Atributos de la superclase Animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public AnimalAcuatico(int numeroAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }

    /**
     * Metodo get, devuelve el numero de aletas del animal acuatico
     * @return numeroAletas
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }

    /**
     * Metodo set, modifica el numero de aletas del animal acuatico
     * @param numeroAletas 
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void nadar(){
        System.out.println("Estoy nadando");
    }
    
    /**
     * Metodo sobreescrito comer, ya que este metodo lo tiene la super clase Animal
     */
    @Override//Metodos sobreescrito
    public void comer(){//este metodo es sobreescrito porque ya se encuentra en la superclase
        System.out.println("Estoy comiendo peces");
    }

    /**
         * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de la superclase
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {//para imprimir los dsatos del la superclase aminal es necesario usar un toString()
        return "AnimalAcuatico{" + "numeroAletas=" + numeroAletas+ ' '+ super.toString()+'}';
    }
}
