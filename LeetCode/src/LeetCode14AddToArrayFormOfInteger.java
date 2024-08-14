import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// nOt completed
public class LeetCode14AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {0};
        int k = 1000;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        String nums = "";
//        List<Integer> list= new ArrayList();
//        Long data= 0L;
//        for(int datas:num){
//            data=data*10+datas;
//        }
//        Long f=data;
////        int data= Arrays.stream(num).reduce(0,(a, b)-> a*10+b);
//        int result=k;
//        nums=Integer.toString(result);
//        for(int j=0;j<nums.length();j++){
//            list.add(Character.getNumericValue(nums.charAt(j)));
//        }
//
//        return list;
        List<Integer> data = new ArrayList();
//        int n=k;
//        for(int i=num.length-1;i>=0;i--){
//            n=num[i]+n;
//            data.add(0,(n)%10);
//            n=n/10;
//        }if(n>0){while(n>0){
//
//            data.add(0,n%10);
//            n=n/10;
//        }}
//        return data;
//        for (int datas : num) {
//            nums += datas;
//        }
//        int n = Integer.parseInt(nums) + k ;
//        {
//            while (n > 0) {
//                data.add(0, n % 10);
//                n = n / 10;
//            }
//        }
//        return data;
        int carry=k;
        int n=num.length-1;
        int i=num.length-1;
        int j=num.length-1;
        while(carry>0){
            if(i!=-1){
            carry=num[i]+carry;
            num[i]=carry%10;
            carry/=10;
            i--;
        }else{
            break;}
        }if(carry==0){
            while(j!=-1) {
                data.add(0, num[j]);
                j--;
            }
        }
        while(carry>0){
            if (n!=-1) {
                data.add(0, num[n]);
                n--;
            }
            else if(carry>=10){
                data.add(0,carry%10);
                carry/=10;
            } else {
                    data.add(0,carry);
                    break;
                }
            }

        return data;
        }

        //System.out.println(addToArrayForm(num, k));

    }
//    static int recussion(int carry,int i,int num){
//        while(carry>0){
//            if(i!=-1){
//                carry=num[i]+carry;
//                num[i]=carry%10;
//                carry/=10;
//                i--;
//            }else{
//                break;}
//        }
//    }

