import java.util.*;
public class pascal {
    public static void main(String[] args) {
        int numrow=5;
        List<List<Integer>> triangle=generate(numrow);
        for(List<Integer> rows:triangle){
            System.out.println(rows);
        }

    }
    public static List<List<Integer>> generate(int numrow){
        List<List<Integer>> traingle=new ArrayList<>();
        for (int i = 0; i < numrow; i++) {
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                int val=traingle.get(i-1).get(j-1)+traingle.get(i-1).get(j);
                row.add(val);
            }
            if(i>0){
                row.add(1);
            }
            traingle.add(row);
   
        }
        return traingle;
    }
    
}
