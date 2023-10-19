 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop07;

/**
 * Contiene los atributos y metodos de la clase Animal, es la superclase
 * @author Luis Hdz
 */
public class Animal extends Object{
    /**
     * nombre nombre del animal
     * lugarOrigen lugar de origen del animal
     * color color del animal
     */
    private String nombre, lugarOrigen, color;

    /**
     * Constructor vacio
     */
    public Animal() {//metodos constructores
    }
    
    /**
     * Constructor lleno
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    
    /**
     * Metodo get, devuelve el nombre del animal
     * @return nombre
     */
    public String getNombre() {//Metodos de servicio
        return nombre;
    }
    
    /**
     * Metodo set, modifica el nombre del animal
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo get, devuelve el lugar de origen del animal
     * @return lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    
    /**
     * Metodo set, modifica el lugar de origen del animal
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    
    /**
     * Metodo get, devuelve el color del animal
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Metodo set, modifica el color del animal
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Metodo que imprime la cadena del sonido que hace el animal
     * @param sound 
     */
    public void hacerSonido(String sound){//Metodos objetivos
        System.out.println("Sonido:"+sound);
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    
    /**
     * Metodo sobreescrito, devulve los atributos de la clase
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override//Metodos sobreescritos
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}
