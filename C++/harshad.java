import java.util.*;
public class harshad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            sum +=temp%10;
            temp /=10;
        }
        if(num%sum==0){
            System.err.println(num+" is a harshad number");
        }
        else{
            System.err.println(num+" is not a harshad number");
        }
    }
}