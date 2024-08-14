public class Q11SearchInRange {
    public static void main(String[] args) {
        int arr[]=new int []{21,32,54,12,53,987,12};
System.out.println(linearSearch(arr,10,1,4));
    }
    public static int linearSearch(int arr[],int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
    }
