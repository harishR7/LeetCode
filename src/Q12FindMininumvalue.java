public class Q12FindMininumvalue {
    public static void main(String[] args) {
        int arr[]=new int []{21,32,54,12,53,987,12};
        System.out.println(min(arr));
    }
    public static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    }
