import java.util.Arrays;

public class LeetCode13TransposeMatrix {
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},{4,5,6}};//,{7,8,9}};
        System.out.println(Arrays.deepToString(findTransposeMatrix(matrix)));
    }
 static int [][] findTransposeMatrix(int [][]matrix){
 int result[][]=new int[matrix[0].length][matrix.length];
 for(int i=0;i<matrix[0].length;i++){
 int start=0;
 int j=0;
 int end=matrix.length-1;
 while(start<=end) {
     result[i][j]= matrix[start][i];
     start++;
     j++;
 }
 }
return result;
 }
 }


