import java.util.*;
public class sumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        System.out.println("enter"+" "+size+" "+numbers: ");
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum +=numbers[i];

        }
        System.out.println("Sum is:"+sum);
    }
    
}
