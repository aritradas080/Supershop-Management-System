package classes;

public class Owner {
    public String name1,name2;
    public int y1,y2;
    public int share1,share2;
    protected static String id1="12345r";
    protected static String id2="123907q";

    public Owner(String name1, String name2, int y1, int y2, int share1, int share2, String id1, String id2) {

        this.name1 = name1;
        this.name2 = name2;
        this.y1 = y1;
        this.y2 = y2;
        this.share1 = share1;
        this.share2 = share2;
        this.id1 = id1;
        this.id2 = id2;
    }
    
	public void ownerinfo(){
        System.out.println("1st Owner name          : "+name1);
        System.out.println("Age of the 1st owner    : "+y1);
        System.out.println("Share of the 1st owner  : "+share1+"%");
        System.out.println("Id of the 1st owner     : "+id1);
        System.out.println("\n\n");
        System.out.println("2nd Owner name          : "+name2);
        System.out.println("Age of the 2nd Owner    : "+y2);
        System.out.println("Share of the 2nd owner  : "+share2+"%");
        System.out.println("Id of the 2nd owner     : "+id2);
    }


    


   
  
    
}
