import java.util.Arrays;

public class LeetCode25SpiralMatrix2 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.deepToString(springMatrix2(n)));
    }
    static int [][] springMatrix2(int num) {
        int rowStart = 0;
        int rowEnd = num - 1;
        int colStart = 0;
        int colEnd = num - 1;
        int [][]matrix=new int [num][num];
        int count = 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int i = colStart; i <= colEnd;i++){
                matrix[rowStart][i]=count++;
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++){
                matrix[i][colEnd]=count++;
            }
            colEnd--;

            if(rowStart<=rowEnd){
            for(int i=colEnd;i>=colStart;i--){
                matrix[rowEnd][i]=count++;
            }}
            rowEnd--;

            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    matrix[i][colStart]=count++;
                }
            }
            colStart++;
        }


       return matrix;
    }
}
