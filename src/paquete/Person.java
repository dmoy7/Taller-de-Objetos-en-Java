/*
 * Taller práctico: Manejo de Clases y Objetos en Java
 * @autor Daniel Ochoa
 */

package paquete;

import java.sql.Date;

public class Person {

    /**
     * Atributos de la clase Person
     */ 
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Constructores de la clase Person  
     */ 
    public Person() {

    }

    /**
     * Métodos de la clase Person
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
     * Método para obtener el atributo lastname1
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Método para dar el atributo lastname1
     */
    public void setLastName1(String lastName1){
        this.lastName1 = lastName1;
    }
}
