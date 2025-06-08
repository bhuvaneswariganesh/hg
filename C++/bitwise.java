import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a b and c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a +" "+~b);
        System.out.println((a<<c) +" "+(b<<c));
        System.out.println((a>>c)+" "+(b>>c));
    }
    
}
