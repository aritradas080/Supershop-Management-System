package classes;

import java.util.Scanner;

public class Login extends Owner  {
    public Login(String name1, String name2, int y1, int y2, int share1, int share2, String id1, String id2) {
    super(name1, name2, y1, y2, share1, share2, id1, id2);
   
  }

  public void loginsystem() {
    Scanner in=new Scanner(System.in);
    
     
    System.out.println("Enter your userid:");
    String id=in.nextLine();
    System.out.println("Enter your password:");
    String password=in.nextLine();
        if(id.equals(id1) &&  "akmds097@#w".equals(password)||id.equals(id2)   ){
           
          System.out.println("You have successfully logged into your account ");
          System.out.println("More information about the shop: ");
          Script sc=new Script(12000,19000,50000,35,27000,100000, "ACI, TAZA ", 5000,1000);
          sc.showprivateinfo();
          
          
          
          
        }
        else
        System.out.println("Invalid user id or Password");
    }

    

   
    
}
