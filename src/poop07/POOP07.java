/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop07;

import Transporte.Acuatico;
import Transporte.Aereo;
import Transporte.Avion;
import Transporte.Barco;
import Transporte.Combi;
import Transporte.Helicoptero;
import Transporte.MediosTransporte;
import Transporte.Metro;
import Transporte.Subterraneo;
import Transporte.Suburbano;
import Transporte.Supraterraneo;
import Transporte.Taxi;
import Transporte.Terrestre;
import Transporte.Trajinera;

/**
 * Actividad de la clase, actividad extra las implementacion de los trasnportes
 * Los transportes deben de estar en otro paquete
 * @author Luis Hdz
 */
public class POOP07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animal= new Animal();//clase Animal
        animal.setNombre("Max");//inicializacion con el metodos set
        animal.setLugarOrigen("CDMX");
        animal.setColor("Cafe");
        System.out.println(animal);
        //System.out.println(animal.toString());//tambien asi se puede imprimir los atributos
        System.out.println("");
        
        AnimalAcuatico animalAcuatico=new AnimalAcuatico();//clase AnimalAcuatico
        animalAcuatico.setNumeroAletas(4);//inicializacion con el metodo set
        animalAcuatico.setNombre("Pingu");
        animalAcuatico.setColor("Azul");
        animalAcuatico.setLugarOrigen("El fondo del mar");
        System.out.println(animalAcuatico);//asi solo imprime los atributos de la clase AnimalAcuatico pero no de la clase superior Animal
        //para imprimir todos los datos revisa la informacion toString() de la clase AnimalAcuatico
        System.out.println("");
        
        Ballena ballena=new Ballena(30,2, "Willy","Canada", "Azul");//clase ballena, inicializacion desde el constructor
        System.out.println(ballena);
        System.out.println("");
        
        AnimalTerrestre anmt = new AnimalTerrestre(4,"Zeus","Mexico","Negro");//clase AnimalTerrestre
        System.out.println(anmt);
        anmt.comer();
        anmt.correr();
        System.out.println("");
        
        Perro perro= new Perro("Naranja",4,"Solovino","Londres","Cafe");//clase Perro
        System.out.println(perro);
        perro.hacerTrucos();
        System.out.println("");
        
        AnimalAereo anma= new AnimalAereo(2,"Bird","Buenos Aires", "Blanco");//clase AnimalAereo
        System.out.println(anma);
        anma.volar();
        anma.comer();
        System.out.println("");
        
        Pajaro pajaro=new Pajaro("Triangular",2,"Loquillo","Springfield","Azul con rojo");//clase Pajaro
        System.out.println(pajaro);
        pajaro.recolectarRamas();
        System.out.println("");
        
        MediosTransporte mdt= new MediosTransporte(2.57f,"Rojo","Mediano");//clase medios de transporte
        System.out.println(mdt);
        mdt.avanzar();
        mdt.encender();
        mdt.apagar();
        System.out.println("");
        
        Terrestre terrestre=new Terrestre("Oaxaca","Mexico",2.5f,2.57f,"Rojo","Mediano");//clase terrestre
        System.out.println(terrestre);
        terrestre.encender();
        terrestre.apagar();
        terrestre.msj();
        System.out.println("");
        
        Subterraneo subt=new Subterraneo("Electrico","Dorada","Riel","Oaxaca","Mexico",2.5f,2.57f,"Rojo","Mediano");//clase subterraneo
        System.out.println(subt);
        subt.parar();
        subt.luces();
        subt.mensaje("Universidad");
        System.out.println("");
        
        Metro metro= new Metro(100,7,15,"Electrico","Dorada","Riel","Oaxaca","Mexico",2.5f,2.57f,"Rojo","Mediano");//clase metro
        System.out.println(metro);
        metro.girar();
        metro.emergencia();
        metro.abrirPuertas();
        System.out.println("");
        
        Suburbano sub= new Suburbano(100,10,80f,"Electrico","Dorada","Riel","Oaxaca","Mexico",2.5f,2.57f,"Rojo","Mediano");//clase suburbano 
        System.out.println(sub);
        sub.abrirPuertas();
        sub.llegar("Buenavista");
        sub.sonar("Buenavista");
        System.out.println("");
        
        Supraterraneo sup=new Supraterraneo("Gasolina","96",4,"Oaxaca","Mexico",2.5f,2.57f,"Rojo","Mediano");//clase supraterraneo
        System.out.println(sup);
        sup.cargarCombustible();
        sup.luces();
        sup.girar("derecha");
        System.out.println("");
        
        Taxi taxi=new Taxi(4,2015,"DYD-99","Gasolina","96",4,"Oaxaca","Mexico",2.5f,2.57f,"Rojo","Mediano");//clase taxi
        System.out.println(taxi);
        taxi.frenar();
        taxi.acelerar();
        taxi.radio();
        System.out.println("");
        
        Combi combi=new Combi("ACV-96",16,2020,"Gasolina","96",4,"Oaxaca","Mexico",2.5f,2.57f,"Rojo","Mediano");//clase combi
        System.out.println(combi);
        combi.cerrarPuerta();
        combi.frenar();
        combi.recibirPago(12.50f);
        System.out.println("");
        
        Aereo aereo= new Aereo("Alemania","Rusia",5,2.57f,"Rojo","Mediano");//clase aereo
        System.out.println(aereo);
        aereo.volar();
        aereo.descender();
        aereo.altitud(1500);
        System.out.println("");
        
        Avion avion=new Avion("Aereo Mexico",800,10,"Alemania","Rusia",5,2.57f,"Rojo","Mediano");//clase avion
        System.out.println(avion);
        avion.volar();
        avion.disminuirVel();
        avion.acelerar();
        System.out.println("");
        
        Helicoptero heli=new Helicoptero(4,2020,7,"Alemania","Rusia",5,2.57f,"Rojo","Mediano");//clase Helicoptero
        System.out.println(heli);
        heli.girarHelices();
        heli.ascender();
        heli.descender();
        System.out.println("");
        
        Acuatico acuatico=new Acuatico("Japon","Metal","Maritimo",2.57f,"Rojo","Mediano");//clase acuatico
        System.out.println(acuatico);
        acuatico.avanzar();
        acuatico.trasladar();
        acuatico.frenar();
        System.out.println("");
        
        Barco barco=new Barco(1500,100,500,"Japon","Metal","Maritimo",2.57f,"Rojo","Mediano");//clase barco
        System.out.println(barco);
        barco.navegar();
        barco.lanzarAncla();
        barco.alertar();
        System.out.println("");
        
        Trajinera traji=new Trajinera(20,3,1.15f,"Japon","Metal","Maritimo",2.57f,"Rojo","Mediano");//clase trajinera
        System.out.println(traji);
        traji.detener();
        traji.girar("Izquierda");
        traji.remar();
    }
}
