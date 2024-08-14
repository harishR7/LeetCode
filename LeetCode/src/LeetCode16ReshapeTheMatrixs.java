import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode16ReshapeTheMatrixs {
    public static void main(String[] args) {
       int [][]mat= {{1,2,4},{3,4,6}};
       int r=3;
       int c=2;
        System.out.println(Arrays.deepToString(matrixReshape(mat,r,c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int matRow=mat.length;
        int matColumn=mat[0].length;
        if(r*c !=matRow*matColumn){
            return mat;
        }
        int arr[][]=new int[r][c];
        int objRow=0;
        int objColumn=0;
        for(int i=0;i<r;i++){
            int column=c;
            int start=0;
            while(start<column){
                arr[i][start]=mat[objRow][objColumn];
                start++;
                if(objColumn<matColumn-1){
                    objColumn++;

                }else{
                    objRow++;
                    objColumn=0;

                }
            }
        }
        return arr;
    }
}
