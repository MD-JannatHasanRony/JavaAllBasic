package javaallbasic;
import java.util.Scanner;
public class TakeInput {
    public static void main(String[] args) {
        Scanner input0 =new Scanner (System.in);
        
        System.out.println("enter your latter=");
        char c=input0.next().charAt(0);
       
        System.out.println("enter your integer number=");
        int a=input0.nextInt();
        System.out.println(a);
        
        System.out.println("enter your true or false=");
        boolean b =input0.nextBoolean();
        System.out.println(b);
        
        System.out.println("enter your line=");
        String s=input0.next();
        System.out.println(s);
        
        
    }
 
}
