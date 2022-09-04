/*
 * Taller práctico: Manejo de Clases y Objetos en Java
 * @autor Daniel Ochoa
 */

package paquete;
    
public class BankAccount {

    /**
     * Atributos de la clase BankAccount
     */
    private int accountNumber;
    protected boolean activated = false;

    /**
     * Constructores de la clase BankAccount  
     */ 
    public BankAccount() {
        
    }

    /**
     * Métodos de la clase BankAccount
     */ 


    /**
     * Método para obtener el atributo accountNumber
     */
    public int getaccountNumber() {
        return accountNumber;
    }

    /**
     * Método para dar el atributo accountNumber
     */
    public void setaccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    /**
     * Método para obtener el atributo activated en estado true
     */
    
    public void act(){
        this.activated = true;
        System.out.println("The account is activated");
    }

    /**
     * Método para obtener el atributo activated en estado false
     */
    public void desact(){
        this.activated = false;
        System.out.println("The account is desactivated");
    }

    /**
     * Método para obtener el atributo activated y ver su estado.
     */
    public void status(){
        if (this.activated == true)
            System.out.println("The account is activated");
        
        else
            System.out.println("The account is desactivated");
    }
}
