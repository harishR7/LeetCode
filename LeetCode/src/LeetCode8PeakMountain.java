//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//https://leetcode.com/problems/find-in-mountain-array/
public class LeetCode8PeakMountain {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,4,3,2};
        System.out.println(peakMountain(arr));
    }












    static int peakMountain(int arr[]){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in the decreasing part
                //this may be the answer look for left
                //this is why end!=mid-1(where mid can also be greater than mid-1 value)
                end=mid;
            } else if (arr[mid]<arr[mid+1]) {
                //yor are in the asc part
                // here we know that mid+1 is > than mid so we take mid+1
                start=mid+1;
            }
        }
        //in the end ,start==end and the poiting the largest value because of the 2 conditions
        //start and end always try to find the max value
        return start;
    }
}
