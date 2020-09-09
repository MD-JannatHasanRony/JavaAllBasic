package javaallbasic;

import java.util.Scanner;

public class TriangleMeasurment {
    public static void main(String[] args) {
        double base=10;
        double hight=49;
        String miter="square miter";
        float a = 1/2f;
        double triangle=a*base*hight;
        System.out.print("This Is Your  Triangle Area="+triangle+miter);
        System.out.println(".");
        
        System.out.print(" This Is Your Triangle Area ="+triangle2()+miter);
        System.out.println(".");
        
        
    }
 static  double triangle2(){
     Scanner input=new Scanner (System.in);
     System.out.print("Enter Your base=");
       double base=input.nextDouble();
       System.out.print("Enter You Sacond hight=");
        double hight=input.nextDouble();
        float a = 1/2f;  
       double triangle =a*base*hight ;
       return triangle ;
       
    
    }
}
