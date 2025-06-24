import java.util.*;
public class hashing {
 public static void main(String[] args) {
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);

    System.out.println(set);
    if(set.contains(2))
    {
        System.out.println("Contains the element 2");
    }
    if(!set.contains(5))
    {
        System.out.println("It doe snot contain 5");
    }


    set.remove(1);
    System.out.println(set.size());
    //set.remove(number present in hashset)
    //same for arraylist also ha its not index but the no present in the hashset
  


 }   
}
