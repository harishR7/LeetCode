public class LeetCode18HoueofRobbies {
    public static void main(String[] args) {
int num[]={2,3,2};
        System.out.println(rob(num));
    }
    public static int rob(int[] nums) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sum+=nums[i];
            }else{
                sum1+=nums[i];
            }
        }
        return sum>sum1?sum:sum1;
    }
//    public static int rob(int[] nums) {
//        int value=pivot(nums);
//        int sum=0;
//        if(value!=-1){
//            sum=nums[value];
//        int n=value+2;
//        if(n<nums.length){
//            sum+=nums[value+2];
//            n=value-2;
//        }else{
//            n=value-2;
//        }
//        if(n>=0){
//            sum+=nums[n];
//        }}
//
//        return sum;
//    }
//    public static int pivot (int[] nums){
//        int start=0;
//        int end=nums.length-1;
//
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(end>mid &&nums[mid+1]<nums[mid]){
//                return mid;
//            }else if(start<mid && nums[mid+1]>nums[mid]){
//                return mid+1;
//            }
//            if(nums[start]==nums[mid] && nums[mid]==nums[start]){
//                if(nums[start]>nums[start+1]){
//                    return start;
//                }
//                start++;
//                if(nums[end]>nums[end-1]){
//                    return end;
//                }
//                end--;
//            } else if (nums[start]==nums[end]) {
//                if(nums[start]>nums[start+1]){
//                    return start;
//                }
//                start++;
//                if(nums[end]>nums[end-1]){
//                    return end;
//                }
//                end--;
//            }
//
//        }
//        return end;
//    }
}
