import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode11Pangram {
    public static void main(String[] args) {
        String str="leetcode";

        int size=26;

        boolean [] arr=new boolean[size];
//        for (int i=0;i<str.length();i++){
//            arr[str.charAt(i)-'a']=true;
//        }
        for(char i='a';i<='z';i++){
            if(!str.contains(String.valueOf(i))){
                System.out.println("true");
            }
        }
//        static boolean isCheck(int ){
//                'a'>=i && i<='z'
//        }

        Boolean[] boolObjectArray = ArrayUtils.toObject(arr);
        List<Boolean> boolList = Arrays.asList(boolObjectArray);

        ArrayList data= new ArrayList(Arrays.asList(arr));
//        for(int j=0;j<size;j++){
//            if(!arr[j]){
//                System.out.println("False");
//            }
//        }
        if(data.contains(false)){
           // return false;
        }
            ;
        System.out.println("true");
    }
}
