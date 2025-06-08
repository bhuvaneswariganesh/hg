
import java.util.Scanner;

public class reverse {
    public static String reversestring(String word) {
        String reversed="";
        for(int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
        }
        return reversed;

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("enter the word:");
        String word=sc.nextLine();
        String result=reversestring(word);
        System.out.println("reversed words:"+result);
    }
    
}
