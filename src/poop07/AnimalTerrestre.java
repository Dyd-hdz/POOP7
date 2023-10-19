/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 * Contiene los atributos y metodos de la clase AnimalTerrestre, es una subclase de la clase Animal
 * @author Luis Hdz
 */
public class AnimalTerrestre extends Animal {
    private int numeroPatas;

    /**
     * Cosntructor vacio
     */
    public AnimalTerrestre() {
    }

    /**
     * Cosntructor lleno
     * Atributos de la clase AnimalTerrestre
     * @param numeroPatas numeros de patas del animal terrestre
     * Atributos de la clase Animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public AnimalTerrestre(int numeroPatas, String nombre, String lugarOrigen, String color){
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }

    /**
     * Metodo get, devuelve el numero de patas del animal terrestre
     * @return numeroPatas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }

    /**
     * Metodo set, modifica el numero de patas del animal terrestre
     * @param numeroPatas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    
    /**
     * Metodo sobreescrito comer, ya que este metodo lo tiene la super clase Animal
     */
    @Override
    public void comer(){
        System.out.println("Estoy comiendo frutas");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de la superclase
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "AnimalTerrestre{" + "numeroPatas=" + numeroPatas +' '+ super.toString()+ '}';
    }
}
