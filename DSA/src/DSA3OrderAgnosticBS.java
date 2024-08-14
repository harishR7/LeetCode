public class DSA3OrderAgnosticBS {
    public static void main(String[] args) {
        //int arr[]=new int []{12,34,56,67,89,90,120,129,135,146};
        int arr[]=new int []{100,92,83,74,66,56,37,28,11,8,1};
        int target=1;
        System.out.println(orderAgnosticBs(arr,target));
    }
    static int orderAgnosticBs(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc=arr[0]<arr[end];
        while(start<=end){
            //find the middle element
            // int mid=start +end/2  // might be the possible that (start + end) exceeds the int range
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            }


        }
        return -1;
    }
}
