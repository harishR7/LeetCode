import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode17LuckyNumber {
    public static void main(String[] args) {
        int [][]matrix = {
                {3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
//    public static List<Integer> luckyNumbers (int[][] matrix) {
//
//        int max=0;
//        List<Integer> list=new ArrayList();
//        for(int i=0;i<matrix.length;i++){
//            int min=0;
//            for(int j=0;j<matrix[i].length;j++){
//                if((j==0) || matrix[i][j]<min){
//                    min=matrix[i][j];
//                }
//            }
//            if(max<min){
//                max=min;
//            }
//
//        }
//        list.add(max);
//        return list;
//    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list=new ArrayList();
        for(int i=0;i<matrix.length;i++){

            int value=findMin(matrix,i);
            int num=matrix[i][value];
            if(checkIsGreaterInColumn(num,value,matrix)){
                list.add(num);
            }
        }

        return list;
    }
    public static int findMin(int arr[][],int i){
        int min =0;
        for(int j=1;j<arr[i].length;j++){
            if( arr[i][j]<arr[i][min]){
                min=j;
            }
        }
        return min;
    }
    public static boolean checkIsGreaterInColumn(int num,int value,int mat[][]){
        for(int i=0;i<mat.length;i++){
            if(mat[i][value]>num){
                return false;
            }
        }
        return true;
    }
//public static List<Integer> luckyNumbers (int[][] matrix) {
//    List<Integer> result = new ArrayList<Integer>();
//
//    for (int row = 0; row < matrix.length; row++) {
//        int minCol = minColInRow(matrix, row);
//        int value = matrix[row][minCol];
//        if (checkIfMaxInCol(matrix, minCol, value)) {
//            result.add(value);
//        }
//    }
//
//    return result;
//}
//
//    private static int minColInRow(int[][] matrix, int row) {
//        int minIndex = 0, min = matrix[row][minIndex];
//        for (int col = 1; col < matrix[row].length; col++) {
//            if (matrix[row][col] < min) {
//                min = matrix[row][col];
//                minIndex = col;
//            }
//        }
//        return minIndex;
//    }
//
//    private static boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
//        for (int row = 0; row < matrix.length; row++) {
//            if (matrix[row][col] > value) return false;
//        }
//        return true;
//    }
}
