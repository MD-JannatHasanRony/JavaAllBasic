
package javaallbasic;

import java.util.Scanner;

public class CircleMeasurment {
    public static void main (String []args){
    
        Scanner input =new Scanner (System.in);
        System.out.print("Enter Your Radius =");
        double radius =input.nextDouble();
        
        
        double circle=3.14159*(radius*radius);
        
        System.out.println("This Is Your Circle Area ="+circle);
    }
}
