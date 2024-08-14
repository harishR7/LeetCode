//https://leetcode.com/problems/search-insert-position/description/
public class LeetCode4CeilingOfAnNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 4;
        System.out.println(floor(arr, target));
    }

    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static int floor(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
       // return arr[start% arr.length-1];
    }
}
