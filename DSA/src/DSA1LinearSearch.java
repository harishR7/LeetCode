public class DSA1LinearSearch {
    public static void main(String[] args) {
        int [] arr= new int[]{};
        System.out.println(linearSearch(arr,7));

    }
    public static int linearSearch(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
