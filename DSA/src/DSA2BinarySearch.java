public class DSA2BinarySearch {
    public static void main(String[] args) {
        int arr[]=new int []{12,34,56,67,89,90,120,129,135,146};
        int target=12;
        System.out.println(binarySearch(arr,target));

    }

    //return the index
    //return -1 when element does not exsist
    static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find the middle element
            // int mid=start +end/2  // might be the possible that (start + end) exceeds the int range
            int mid=start+(end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            } else if (target> arr[mid]) {
                start = mid + 1;
            } else{
                return start;
            }

        }
//        if(arr.length>start){
//            return arr[start];
//        }
        return -1;
    }
    }
