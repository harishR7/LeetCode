import java.util.Arrays;

public class Q13SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {21, 76, 98},
                {90, 67, 32, 6},
                {62, 94, 26, 1000, 12}
        };
        //System.out.println(max(arr));
        System.out.println(Arrays.toString(search(arr, 12)));
    }

    public static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static int max(int[][] arr){
        int max=arr[0][0];
        for(int [] num:arr){
            for (int in:num){
                if(in>max){
                   max=in;
                }
            }
        }
        return max;
    }
    }

