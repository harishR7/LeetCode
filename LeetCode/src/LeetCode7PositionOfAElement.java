//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class LeetCode7PositionOfAElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6,8,9,10,12,14,23,34,37,39,45,48,52,57,60,62,64,68,70,73,75,79,80,82,83,86,87,89};
        int target = 60;
        System.out.println(findStartAndEnd(arr,target));
    }
    static int findStartAndEnd(int arr[],int target){
        int start=0;
        int end =1;
        while(target>arr[end]){
            int temp=end+1;
            end=end +(end-start+1)*2;
            start=temp;
        }
        return  binarySearch(arr,target,start,end);
    }
    static  int binarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
        return -1;
    }
}
