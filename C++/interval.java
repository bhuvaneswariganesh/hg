import java.util.*;
public class interval {
    public static int xor(int[] arr, int n){
        int orvalue=0;
        int result=0;
        for(int i=0;i<n;i++){
            orvalue |= arr[i];
            result ^=orvalue;
        }
        return result;

    }
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the elements: ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int xorresult=xor(arr,n);
    System.out.println("output is:"+xorresult);

}
}
