
import java.util.Scanner;

public class count1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=13;
        while(n>0)
        {
            count +=n&1;
            n >>=1;
        }
        System.out.println(count);
        int n1=sc.nextInt();
        boolean ispoweroftwo=(n1>0)&&((n1&(n1-1))==0);
        System.out.println(ispoweroftwo);
        int[] arr={2,5,2,7,9,7,9};
        int res=0;
        for(int n2:arr){
            res ^=n2;
        }
        System.out.println(res);
    }
    
}
