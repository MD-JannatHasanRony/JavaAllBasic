package javaallbasic;

import java.util.Scanner;

public class RectangleMeasurment {
 
public static void main (String[]args){
    
double langth;
double width;
double rectangle;

Scanner input=new Scanner (System.in);

    System.out.print("Enter your langht=");
    langth=input.nextDouble();
   
    
    System.out.print("Enter your width=");
    width=input.nextDouble();

   rectangle = langth*width;

    System.out.println("This Is Your Rectangle Area="+rectangle);

}    
}
