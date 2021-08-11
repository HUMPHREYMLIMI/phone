/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.JFrame;
 
public class Phone
{
    
     
    public static void main(String[] args)
    {
       String num2;
       String num1;
       String num3;
        int set2, set3,set4,set5,set6,set7; //sequence 2 and 3 of the phone number
        
        Random generator = new Random();
        Scanner input=new Scanner(System.in);
        
    System.out.println ("Enter the first employee");
        num1=input.nextLine();
     System.out.println ("Enter the second employee");
        num3=input.nextLine();  
        System.out.println ("Enter the third Employee");
      num2=input.nextLine(); 
                 
        
        
        set2 = generator.nextInt(643) + 100;
        set4=generator.nextInt(643) + 100;
        set5=generator.nextInt(8999) + 1000;
        set6=generator.nextInt(643) + 100;
        set7=generator.nextInt(8999) + 1000;
        //Sequence 3 of numebr
        // add 1000 so there will always be 4 numbers
        //8999 so it wont succed 9999 when the 1000 is added
        set3 = generator.nextInt(8999) + 1000;
        
           
        
        
        
       // System.out.println (  "JABU will be on the VODACOM network with phone number 072"  + " " + set4 + "-" + "("+set5+")" );
        //System.out.println (  "HENRY will be on the MTN network with phone number 083"  + " " + set6 + "-" + "("+set7+")" );
        JFrame frame = new JFrame();
        String numbers="CELL PHONE NUMBER GENERATOR\n************************************************\n"+num2+" will be on the CELL C network with phone number 084"  + " " + set2 + "-" + "("+set3+")\n"+num3+" will be on the VODACOM network with phone number 072"  + " " + set4 + "-" + "("+set5+")\n"+num1+" will be on the MTN network with phone number 083"  + " " + set6 + "-" + "("+set7+")";
        JOptionPane.showMessageDialog(null,numbers );
        
    }}