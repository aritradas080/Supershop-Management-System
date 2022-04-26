
package classes;
public class Shopdetails {
    public String shopname;
    public int numberofowners;
    public String address;
    public String availability;
    public int numberofmanagers;
    public int numberofemployees;
    public String itemtypes;

    public Shopdetails(String shopname, int numberofowners, String address, String availability, int numberofmanagers, int numberofemployees, String itemtypes) {
        this.shopname = shopname;
        this.numberofowners = numberofowners;
        this.address = address;
        this.availability = availability;
        this.numberofmanagers = numberofmanagers;
        this.numberofemployees = numberofemployees;
        this.itemtypes = itemtypes;
    }
    public void display(){
        System.out.println("Shop name            : "+shopname);
        System.out.println("Number of owners     : "+numberofowners);
        System.out.println("Address              : "+address);
        System.out.println("Availability         : "+availability);
        System.out.println("Number of managers   : "+numberofmanagers);
        System.out.println("Number of employees  : "+numberofemployees);
        System.out.println("Items available here : "+itemtypes);
    }
    
    


    
}
