/*
 * Taller práctico: Manejo de Clases y Objetos en Java
 * @autor Daniel Ochoa
 */

package paquete;

public class Motorbike {
    /**
     * Atributos de la clase Motorbike
     */
    private int plateNumber;
    protected boolean turnOn;

    /**
     * Constructores de la clase Motorbike  
     */ 
    public Motorbike() {
        
    }

    /**
     * Métodos de la clase Motorbike
     */ 


    /**
     * Método para obtener el atributo plateNumber
     */
    public int getplateNumber() {
        return plateNumber;
    }

    /**
     * Método para dar el atributo plateNumber
     */
    public void setplateNumber(int plateNumber){
        this.plateNumber = plateNumber;
    }

    /**
     * Método para obtener el atributo activated en estado true
     */
    
    public void act(){
        this.turnOn = true;
        System.out.println("The motorbike is on");
    }

    /**
     * Método para obtener el atributo activated en estado false
     */
    public void desact(){
        this.turnOn = false;
        System.out.println("The motorbike is off");
    }

    /**
     * Método para obtener el atributo activated y ver su estado.
     */
    public void status(){
        if (this.turnOn == true)
            System.out.println("The motorbike is on");
        
        else
            System.out.println("The motorbike is off");
    }   
}
