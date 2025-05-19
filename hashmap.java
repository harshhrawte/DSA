import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("INdia",2);
        map.put("America",1);

   for(Map.Entry<String,Integer> e:map.entrySet()){
      System.out.println(e.getKey());      
      System.out.println(e.getValue());              
   }
    }
}
