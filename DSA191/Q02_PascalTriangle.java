package DSA191; 
import java.util.ArrayList; 
import java.util.List;      

public class Q02_PascalTriangle { 

    public static void main(String[] args) { 
        int numRows = 5; 
        List<List<Integer>> triangle = generate(numRows); 
      
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

   static List<List<Integer>>generate(int numRows)
   {
       List<List<Integer>>result =new ArrayList<>();
       for(int row=1;row<=numRows;row++)
       {
       List<Integer> currRow=new ArrayList<>();
        long value=1;
        currRow.add(1);
       
      for(int col=1;col<row; col++)
       {
        value=value*(row-col);
        value=value/col;
        currRow.add((int) value); 
       }
       result.add(currRow);
    }
       return result;
   }
 }
