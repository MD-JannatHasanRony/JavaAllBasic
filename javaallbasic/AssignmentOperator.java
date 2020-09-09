package javaallbasic;
public class AssignmentOperator {
    public static void main(String[] args) {
        
        int a=10;
        double b=20;
        float c=30;
        int name = (int)(b+=a);
        System.out.println(name);
        float name2 = (float) (c-=a);
        System.out.println(name2);
        b*=c;
        System.out.println(b);
        b/=a;
        System.out.println(b);
        b%=c;
        System.out.println(b);
        
        
    }
    
}
