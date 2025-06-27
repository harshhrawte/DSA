package DSA191; 
import java.util.ArrayList; // Importing ArrayList class from java.util package.
import java.util.List;      // Importing List interface to use List<List<Integer>>.

public class Q02_PascalTriangle { // Class declaration.

    public static void main(String[] args) { // Main method: program starts here.
        int numRows = 5; // You can change this to generate more rows.
        List<List<Integer>> triangle = generate(numRows); // Calling method to generate the triangle.
        
        // Printing the triangle from the stored list
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    // This method builds Pascal’s Triangle and stores it in a list of lists
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
