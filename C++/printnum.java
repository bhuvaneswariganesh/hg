import java.util.*;
public class printnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.print(i+" ");
        }
    }
}
