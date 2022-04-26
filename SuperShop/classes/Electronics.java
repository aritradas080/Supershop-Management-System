package classes;

import java.util.Scanner;

import interfaces.*;

public class Electronics implements Electronicitems {
    public void displayElecctronicsitems(){
        System.out.println("=======Welcome to Electronic section=====");
        System.out.println("");
        System.out.println("1. Electronic Iron............220/-");
        System.out.println("2. Multi-Plug.................110/- ");
        System.out.println("3. Flash Light................90/-");
        System.out.println("4. Calculator.................677/-");
        System.out.println("5. Table Fan..................2000/-");
        System.out.println("6. Tube Light..................45/-");
        System.out.println("7. Fairy Light.................600/-");
        System.out.println("8. Digital Watch................1500/-");

    }
    public int displayelectronicsitemsbill(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice = ");
            System.out.println("To confirm your order press '*'");
            char c = '0';
            
            int totalBill = 0;
            while(true) {
                
                c = sc.next().charAt(0);
                
                if(c == '*') {
                    break;
                }
                
                else if(c == '1') {
                    totalBill += 220;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '2') {
                    totalBill += 110;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '3') {
                    totalBill += 90;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                else if(c == '4') {
                    totalBill += 677;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '5') {
                    totalBill += 2000;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '6') {
                    totalBill += 45;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '7') {
                    totalBill += 600;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }

                else if(c == '8') {
                    totalBill += 1500;
                    System.out.println("Amount = "+totalBill+" Tk");
                    
                }
                
                System.out.println("Bill from this section = "+totalBill+" Tk");
    }
    return totalBill;
    
}}
