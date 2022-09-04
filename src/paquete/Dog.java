/*
 * Taller práctico: Manejo de Clases y Objetos en Java
 * @autor Daniel Ochoa
 */

package paquete;

import java.util.ArrayList;

public class Dog {
    /**
     * Atributos de la clase Dog
     */
    public String name;
    private int years;
    public ArrayList<String> race = new ArrayList<String>();

    /**
     * Constructores de la clase Dog  
     */ 
    public Dog() {

    }

    /**
     * Métodos de la clase Dog
     */ 

    /**
     * Método para obtener el atributo name
     */
    public String getName() {
        return name;
    }

    /**
     * Método para dar el atributo name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Método para obtener el atributo years
     */
    public int getYears() {
        return years;
    }

    /**
     * Método para dar el atributo years
     */
    public void setYears(int years){
        this.years = years;
    }


    /**
     * Método para obtener el atributo race
     */
    public ArrayList<String> getRace() {
        race.add("Pitbull");
        race.add("Fox Terrier");
        race.add("Chihuahua");
        return race;
    }
    
}
