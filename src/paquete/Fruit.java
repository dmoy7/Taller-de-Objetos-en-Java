
/*
 * Taller práctico: Manejo de Clases y Objetos en Java
 * @autor Daniel Ochoa
 */

package paquete;

import java.util.ArrayList;

public class Fruit {

    /**
     * Atributos de la clase Fruit
     */
    public String name;
    private Float averageWeight;
    public ArrayList<String> colors = new ArrayList<String>();

    /**
     * Constructores de la clase Fruit  
     */ 
    public Fruit() {

    }

    /**
     * Métodos de la clase Fruit
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
     * Método para obtener el atributo colors
     */
    public ArrayList<String> getcolors() {
        colors.add("Green");
        colors.add("Red");
        return colors;
    }   
}
