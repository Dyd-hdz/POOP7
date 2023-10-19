/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 * Contine los atributos y metodos de la clase Perro, es una subclase de la clase AnimalTerrestre
 * @author Luis Hernández
 */
public class Perro extends AnimalTerrestre {
    private String colorCollar;

    /**
     * Cosntructor vacio
     */
    public Perro() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Perro
     * @param colorCollar color del collar del perro
     * Atributos de la clase AnimalTerrestre
     * @param numeroPatas numero de patas del animal terrestre
     * Atributos de la clase Animal
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    /**
     * Metodo get, devuelve el color del collar del perro
     * @return colorCollar
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * Metodo set, modifica el color del collar del perro
     * @param colorCollar 
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void hacerTrucos(){
        System.out.println("Estoy dando una vuelta hacia atras");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar +' '+ super.toString()+ '}';
    }
}
