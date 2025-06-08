import java.util.Scanner;

public class count {
    public static String vowsoncount(String word){
        int vowelscount=0;
        int conscount=0;
        for(char c:word.toCharArray()){
            if("aeiou".indexOf(c)!= -1){
                vowelscount++;
            }
            else{
                conscount++;
            }
        }
        return "vowels:"+vowelscount + "consonants:"+conscount;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the words:");
        String word=sc.nextLine();
        String vows=vowsoncount(word);
        System.out.println(vows);

    }
    
}
