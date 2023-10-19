/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transporte;

/**
 * Contiene los atributos y metodos de la clase Combi, es una subclase de la clase Supraterraneo
 * @author Luis Hernández
 */
public class Combi extends Supraterraneo {
    private String placa;
    private int pasajeros, modelo;

    /**
     * Constructor vacio
     */
    public Combi() {
    }

    /**
     * Constructor lleno
     * Atributos de la clase Combi
     * @param placa placa de la combi
     * @param modelo modelo de la combi
     * @param pasajeros numero de pasajeros de la combi
     * Atributos de la clase Supraterraneo
     * @param combustible tipo de combustible del medio de transporte supraterraneo
     * @param ruta ruta que sigue el medio de transporte supraterraneo
     * @param nLlantas numero de llantas del medio de transporte supraterraneo
     * Atributos de la clase Terrestre
     * @param direccion direccion del medio de transporte terrestre
     * @param lugarOrigen lugar de origen del medio de transporte terrestre
     * @param duracionViaje duraccion del viaje del medio de transporte terrestre
     * Atributos de la clase MediosTransporte
     * @param peso peso del medio del transporte
     * @param color color del medio del transporte 
     * @param tam tamaño del medio del transporte
     */
    public Combi(String placa, int modelo, int pasajeros, String combustible, String ruta, int nLlantas, String direccion, String lugarOrigen, float duracionViaje, float peso, String color, String tam) {
        super(combustible, ruta, nLlantas, direccion, lugarOrigen, duracionViaje, peso, color, tam);
        this.placa = placa;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
    }

    /**
     * Metodo get, devuelve la placa de la combi
     * @return placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Metodo set, modifica la placa de la combi
     * @param placa 
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo get, devuelve el modelo de la combi
     * @return modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Metodo set, modifica el modelo de la combi
     * @param modelo 
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo get, devuelve el numero de pasajeros de la combi
     * @return pasajeros
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /**
     * Metodo set, modifica el numero de pasajeros de la combi
     * @param pasajeros 
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void cerrarPuerta(){
        System.out.println("Los pasajeros ya subieron, es hora de cerrar las puertas");
    }
    
    /**
     * Metodo que devuelve un mensaje concatenado al parametro recibido
     * @param pasaje pasaje a cobrar
     */
    public void recibirPago(float pasaje){
        System.out.println("El pasaje es de "+pasaje);
    }
    
    /**
     * Metodo que devuelve un mensaje
     */
    public void frenar(){
        System.out.println("Para que los pasajeros suban/bajen es necesario frenar");
    }

    /**
     * Metodo sobreescrito, devulve los atributos de la clase mas la concatenacion de los atributos de las superclases
     * @return Regresa una concatenacion de los valores de los atributos
     */
    @Override
    public String toString() {
        return "Combi{" + "placa=" + placa + ", pasajeros=" + pasajeros + ", modelo=" + modelo +' '+super.toString()+ '}';
    }
}
