import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Q14OccurenceCountofaChar {
    public static void main(String[] args) {
        String str="The maximum of all characters in GgeeksforGeeks is";
        System.out.println(OccurenceCount(str));
    }
    static int OccurenceCount (String str){
       String data=str.replaceAll(" ","").toLowerCase();
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<data.length();i++){
           Integer occurence= map.get(String.valueOf(data.charAt(i)));
           if(occurence==null){
               occurence=0;
           }
           map.put(String.valueOf(data.charAt(i)),occurence+1);
        }
        Optional result=map.values().stream().max(Integer::compareTo);

        return result.isPresent()? (int) result.get() :0;

    }
}
