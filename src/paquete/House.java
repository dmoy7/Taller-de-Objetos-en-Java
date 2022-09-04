/*
 * Taller práctico: Manejo de Clases y Objetos en Java
 * @autor Daniel Ochoa
 */

package paquete;

public class House {
    /**
     * Atributos de la clase House
     */ 
    public String city;
    public String neighborhood;
    public int rooms;
    private int bathrooms;
    public int kitchen;

    /**
     * Constructores de la clase House  
     */ 
    public House() {

    }

    /**
     * Métodos de la clase House
     */ 

    
    /**
     * Método para obtener el atributo city
     */
    public String getCity() {
        return city;    
    }

    /**
     * Método para dar el atributo city
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Método para obtener el atributo neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * Método para dar el atributo neighborhood
     */
    public void setNeighborhood(String neighborhood){
        this.neighborhood = neighborhood;
    }

    /**
     * Método para obtener el atributo rooms
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * Método para dar el atributo rooms
     */
    public void setRooms(int rooms){
        this.rooms = rooms;
    }
}
