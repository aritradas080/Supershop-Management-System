package classes;

import java.lang.*;
import java.util.Scanner;

import interfaces.*;

public class Veg_Non_vegitems implements Veg_non_Veg {
    public void display_Veg_Non_Vegitems(){
        System.out.println("====Welcome to Veg and non Veg Section=====");
        System.out.println("");
        System.out.println("1. Chicken 1kg..............800/- ");
        System.out.println("2. Tomato 1kg.............30/-");
        System.out.println("3. Fish 1kg................1000/-");
        System.out.println("4. Fruits 1kg..............60/-");
        System.out.println("5. Beef 1kg................220/-");
        System.out.println("6. Mutton 1 kg..............450/-");
        System.out.println("7. Cauliflower 1 kg.........70/-");
        System.out.println("8. Cabbage 1 kg.............100/-");
    }
    public int Veg_Non_vegitemsbill(){
       Scanner sc1=new Scanner(System.in);
       System.out.println("Enter your choice = ");
            System.out.println("To confirm your order press '*'");
            char i = '0';
            
            int totalBill = 0;
            while(true) {
                
                i = sc1.next().charAt(0);
                
                if(i == '*') {
                    break;
                }
                
                else if(i == '1') {
                    totalBill += 800;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '2') {
                    totalBill += 30;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '3') {
                    totalBill += 1000;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(i == '4') {
                    totalBill += 60;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '5') {
                    totalBill += 220;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '6') {
                    totalBill += 450;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '7') {
                    totalBill += 70;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(i == '8') {
                    totalBill += 100;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                System.out.println(" Bill from this section = "+totalBill);
    }
    return totalBill;
    
}
}
