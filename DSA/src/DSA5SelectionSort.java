import java.util.Arrays;

public class DSA5SelectionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectSort(new int []{3,6,2,8,1,5})));
    }

    static int [] selectSort(int []nums){


        for(int i=0;i<nums.length;i++){
            int max=0;
            int ind=0;
            for(int j=0;j<=nums.length-1-i;j++){
                if(nums[j]>max) {
                    max = nums[j];
                    ind = j;
                }
            }
            if(nums.length-i-1 !=ind) {
                int temp = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = max;
                nums[ind] = temp;
            }
        }
        return nums;
    }
}
