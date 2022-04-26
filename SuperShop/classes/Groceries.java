package classes;

import java.lang.*;

import java.util.Scanner;

import interfaces.*;

public  class Groceries implements Groceryitems {
   
    public void displayGroceries(){
        System.out.println("=====Welcome to groceries Section======");
        System.out.println("");
        System.out.println("1. Rice 1kg.........70/-");
        System.out.println("2. Pulses 1kg..........35/-");
        System.out.println("3. Oil 1Litre.........65/-");
        System.out.println("4. Flour 1kg.........60/-");
        System.out.println("5. Garlic 1kg.........20/-");
        System.out.println("6. Onions 1kg.........45/-");
        System.out.println("7. Potato 1kg.........25/-");
        System.out.println("8.Polao Rice 1kg..........120/-");
    }


        public int displayGrocerieBill() {
		
            Scanner input = new Scanner(System.in);
        
            System.out.println("Enter your choice = ");
            System.out.println("To confirm your order press '*'");
            char i='0';
            
            int totalBill = 0;
            while(true) {
                
                i = input.next().charAt(0);
                
                if(i == '*') {
                    break;
                }
                
                else if(i == '1') {
                    totalBill += 70;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '2') {
                    totalBill += 35;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '3') {
                    totalBill += 65;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '4') {
                    totalBill += 60;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '5') {
                    totalBill += 20;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '6') {
                    totalBill += 45;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '7') {
                    totalBill += 25;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '8') {
                    totalBill += 120;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                System.out.println(" Bill from this section = "+totalBill+" Tk");
               
                


                
            
                
    }
    return totalBill;
}


}


        
