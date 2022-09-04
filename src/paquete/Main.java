/**
 * @autor Daniel Ochoa
 */

package paquete;


public class Main {
    public static void main(String[] args)  {
        
        /**
         * Construcción de objetos para inicializar sus atributos
         */
        Person p = new Person();
        Fruit f = new Fruit();
        BankAccount b = new BankAccount();
        House h = new House();
        Dog d = new Dog();
        Motorbike m = new Motorbike();


        /**
         * Se dan valores a los atributos de los objetos
         */
        p.setName("Daniel");
        p.setLastName1("Ochoa");
        f.setName("Apple");
        b.setaccountNumber(7777777);
        h.setCity("Guarne");
        h.setNeighborhood("Santo Tomás");
        h.setRooms(3);
        d.setName("Morgan");
        d.setYears(11);
        m.setplateNumber(888);

       
        
        /**
         * Se muestra en consola los difentes valores de los atributos de los objetos
         */
        System.out.println("Name: " + p.getName());
        System.out.println("First Last Name: " + p.getLastName1());
        System.out.println("Fruit Name: " + f.getName());
        System.out.println("Color of the apple: " + f.getcolors());
        System.out.println("The account Number is: " + b.getaccountNumber());
        b.desact();
        b.act();
        b.status();
        System.out.println("The house is in: " + h.getCity());
        System.out.println("The Neighborhood is: " + h.getNeighborhood());
        System.out.println("The number of rooms is: " + h.getRooms());
        System.out.println("The dog's name is: " + d.getName());
        System.out.println("The dog's age is: " + d.getYears());
        System.out.println("The dog's race is: " + d.getRace());
        System.out.println("The plate of Number is: " + m.getplateNumber());

        m.desact();
        m.act();
        m.status();



    }
}
