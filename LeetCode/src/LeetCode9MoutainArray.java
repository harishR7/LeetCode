public class LeetCode9MoutainArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,3,2,1};
        int target=1;
        System.out.println(moutainArray(arr,target));


    }
    static int moutainArray(int arr[],int target){
        int peak=peakOfArray(arr);
       int value= binarySearch(arr,target,0,peak);
        if(value!=-1){
            return value;
        }
          return binarySearch(arr,target,peak+1,arr.length-1);
    }
    static int peakOfArray(int arr[]){
      int start=0;
      int end=arr.length-1;

      while(start<end){
          int mid=start+(end-start)/2;
          if(arr[mid]>arr[mid+1]){
              end=mid;
          } else if (arr[mid]<arr[mid+1]) {
              start=mid+1;
          }
      }
      return start;
    }
    static int binarySearch(int arr[] ,int target,int start,int end){

        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {

            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
            if(target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }}else{
                if(target<arr[mid]){
                    start=mid+1;
                }else if (target>arr[mid]){
                    end=mid-1;
                }

            }
        }
        return -1;
    }
}
