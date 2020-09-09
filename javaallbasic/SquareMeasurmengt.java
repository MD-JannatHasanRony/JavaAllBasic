package javaallbasic;

import java.util.Scanner;

public class SquareMeasurmengt {
    
    public static void main (String[]args) {
        
        
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Your Length Of Side =");
        double lengthOfSide=input.nextDouble();
        
        
        double square=lengthOfSide*lengthOfSide;
        
        System.out.println("This is your Square area ="+square);
        
        
        

}   
}
