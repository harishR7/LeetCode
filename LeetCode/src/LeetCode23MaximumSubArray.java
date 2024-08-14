public class LeetCode23MaximumSubArray {
    public static void main(String[] args) {
int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
    }

    // Using brute force method
    public static  int maxSubArray(int[] nums) {

         int max=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j< nums.length;j++){
                sum=sum+nums[j];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }

    //Using Kadane Algorithm
       public static  int maxSubArray1(int[] nums) {
        int currentSum=0;
        int max=0;
        for (int i=0;i<nums.length;i++){
            currentSum=Math.max(currentSum+nums[i],nums[i]);
            if(max<currentSum){
                max=currentSum;
            }
        }
        return max;
       }


       // Using divded and conquor

    public static  int maxSubArray2(int[] nums) {
return divdedAndConquer(nums,0,nums.length-1);
    }
    static int divdedAndConquer(int []nums, int start,int end){

        if(start==end){
            return nums[start];
        }
        int mid=start+(end-start)/2;

        int sum=0,leftMax=Integer.MIN_VALUE;
        for(int l=mid;l>=0;l--) {
            sum += nums[l];
            if (sum > leftMax) {
                leftMax = sum;
            }
        }

        sum=0;
         int rightMax=Integer.MIN_VALUE;
         for(int r=mid+1;r<=end;r++){
             sum+=nums[r];
             if(sum>rightMax){
                 rightMax=sum;
             }
         }

int maxRightLeft=Math.max(divdedAndConquer(nums,0,mid),divdedAndConquer(nums,mid+1,end));
         return Math.max(maxRightLeft,rightMax+leftMax);
    }
//    public int maxSubArray(int[] nums) {
//        int n = nums.length;
//        int maxi = nums[0];
//        int sum = 0;
//
//        for(int i=0; i<n; i++) {
//            sum += nums[i];
//            maxi = Math.max(sum,maxi);
//            if(sum < 0)
//                sum = 0;
//        }
//
//        return maxi;
//    }

}
