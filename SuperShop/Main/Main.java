package Main;
import java.util.*;
import classes.*;
import fileio.Fileio;

public class Main {
	public static void main(String[] args) {
		
		Fileio io=new Fileio();
		io.writeInFile("Hello, This is our Shop A/R Enterprise.Here available items are groceries,electronics and veg and non-veg .We always try to keep our Items fresh,healthy and Suitable for our customers ");
		System.out.println();
		io.readFromFile();
               double abc;
	
				int i,p=0,q=0,r=0;
			    System.out.println();
				System.out.println("=========Welcome to A/R Enterprise==========");
				System.out.println("Please Select your Desired Option : ");
				System.out.println(" ");
				System.out.println("1. Shop details: ");
				System.out.println("2. Owner Details: ");
				System.out.println("3. Manager Details: ");
				System.out.println("4. Employee Details: ");
				System.out.println("5. Items: ");
				System.out.println("6. Calculation: ");
				System.out.println("7. More Information about Our Shop : ");
				System.out.println("8. Exit: ");
				while(true){
					System.out.println();
				System.out.println("Which option do you want to choose:");
				Scanner input=new Scanner(System.in);                     //Scanner class
				i=input.nextInt();
				
				if(i==1){
					System.out.println();
					Shopdetails sp=new Shopdetails("A/R Enterprise",2,"32/81 East Banani,Dhaka","Daily 8 am to 10 pm",1,6,"Grocerries,Veg and non-Veg and Electronics ");
					sp.display();
				}
		
				
				else if(i==2){
					Owner o1=new Owner("Abdur Razzak", "Md.Abul Hasnat", 47, 45, 60, 40, "12345r", "123907q");
					o1.ownerinfo();
				}

				else if(i==3){
					System.out.println();
					Manager m1=new Manager("Anisur Rahman",30,"10122-a","03/04/1990","anis@gmail.com","01722**","MD. Rehanul Haque","Afsana Kabir","Barisal","Dhaka","Married",18000); 
				  m1.managerinfo();
		
				}
				 else if(i==4){
					 System.out.println();
				Employees e1=new Employees("S.M. Akash","101-a",10000, "Karim Sheikh", "Rehana Begum", "06/09/2000","18 July 2017", "Noakhali", "Dhaka", "akash@gmail.com", "121323", "Married");
				  e1.Employeeinfo();
				  System.out.println("\n\n");

				  Employees e2=new Employees("S.M.Parvez","102-a",11000,"Kamal Hussain","Sadia Sultana", "07/11/2001","22 October 2017", "Barishal", "Dhaka", "parvez@gmail.com", "12345", "Unmarried");
				  e2.Employeeinfo();
				  System.out.println("\n\n");

				  Employees e3=new Employees("Abduz Rahim","103-a", 12000,"Abduz Sazzad","Anika Tabassum","07/12/2001","25 November 2019","Pabna","Dhaka", "rahim@hotmail.com", "34567",  "Married");
				  e3.Employeeinfo();
				  System.out.println("\n\n");

				  Employees e4=new Employees("Mostafizur Rahman","104-a",13000,"Monayem Hasan","Anika Sultana","09/12/2002", "22 December 2016","Sylhet", "mostafizur@gmail.com", "122433535", "Married","Unmaried");
				  e4.Employeeinfo();
				  System.out.println("\n\n");

				  Employees e5=new Employees("Hasibur Rahman","105-a",11000,"Rakibul Hasan","Marium Begum","01/01/2003","22 January 2016","Potuakhali","Dhaka", "haibur@gmail.com", "1223243","Married");
				  e5.Employeeinfo();
				  System.out.println("\n\n");

				  Employees e6=new Employees("Md.Bosir","106-a",15000,"Bahar Islam","Jomila Begum", "06/04/2000", "1st February 2003","Chittagong","Dhaka", "boshir@gmail.com", "01837284634", "Unmarried");
				  e6.Employeeinfo();
				  System.out.println("\n\n");
		
			}
			
		        else if(i==5){
					  
					items ic=new items();
					ic.info();
					
					
					
				  
					 
					  
					  
		
					
					while(true){
						System.out.println("Enter your choice:");
						System.out.println("Enter 5 to exit:");
						
						
		
						int a=input.nextInt();
						if(a==5){
							break;
						}
					if(a== 1){
		
						Groceries g1 = new Groceries();
						g1.displayGroceries();
						 p=g1.displayGrocerieBill();
						
					  
						
					}
					
			
					 if(a == 2){
						Veg_Non_vegitems vgn=new Veg_Non_vegitems();
						vgn.display_Veg_Non_Vegitems();
						 q=vgn.Veg_Non_vegitemsbill();
					   
						
					 }
					
			
					 if(a == 3){
						Electronics ec=new Electronics();
						ec.displayElecctronicsitems();
						r= ec.displayelectronicsitemsbill();
						
						
						
					}
					 
				}
				
			}
			else if(i==6){
				abc=p+q+r;
				System.out.println("Total Bill :"+abc);
				System.out.println("Do You have a voucher code for Discount? : ");
				final String code = "1234a#";
		
			
				 input = new Scanner(System.in);
		
				System.out.println("Enter voucher code to get 20% off:");
				String inputpin = input.nextLine();
		
				if (inputpin.equalsIgnoreCase(code)) {
		
					double finalbill = abc;
					 finalbill=finalbill-(finalbill*.2);
				
					
		
					System.out.println("Your bill after 20% off: " +finalbill);
					System.out.println("Your discount is processed.");
					  
				} else
					System.out.println("Sorry,No Discount code available for you");
		
			
				
				}
			else if(i==7){
				System.out.println();
				Login lg=new Login("Abdur Razzak", "Md.Abul Hasnat", 47, 45, 60, 40, "12345r", "123907q");
				lg.loginsystem();
				
				
			} 
		else if(i==8){
			System.out.println("Good Bye,Come back to our shop once again.Have a Nice Day");
			break;
			
		}
		else
		System.out.println("Invalid Option chosen");
	}
}
}
	
		
		
		
			
				   
				
				
			
		
			
				
			
				
		
			
		
				
			
		
		   
		
		
		
		
		

		
	
	    


		


