package javaallbasic;
public class ArithmaticOperator {
    
    public static void main(String[] args) {
        
        int i=43;
        char a= 'a';
        boolean b=true;
        float f = 3.44f;
        double d= 5.00;
        String s = "roni vai ";
        
        // summation
        float result=i+f;              String result6 =s+a;
        System.out.println(result);    System.out.println(result6);
        //subtraction
        double result2=i-d;             String result7=s+i+b;
        System.out.println(result2);    System.out.println(result7);
        //multiplication
        float result3=(float) (40*d);
        System.out.println(result3);
        //division
        float result4=(float) (40.00/d);
        System.out.println(result4);
        //remainder
        int result5= 40%(int)d;
        System.out.println(result5);
        
        
    }
    
}
