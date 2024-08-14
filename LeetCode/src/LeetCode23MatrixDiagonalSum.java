public class LeetCode23MatrixDiagonalSum {
    public static void main(String[] args) {
//        int [][] mat={{1,1,1,1},
//                      {1,1,1,1},
//                      {1,1,1,1},
//                      {1,1,1,1}};
//        int mat [][]={{2,3},
//                {4,5}};
        int [][] mat= {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(diagonalSum1(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int rowLen=mat.length;
        int colLen=mat[0].length;
        int sum=0;

        if(rowLen-1==0 && colLen-1==0){
            return mat[0][0];
        }
        sum =mat[0][0] + mat[0][colLen-1];
        sum=sum+mat[rowLen-1][0]+mat[rowLen-1][colLen-1];
        if(rowLen>2 && colLen>2) {
           return  binary(1, rowLen - 2, 0, colLen - 1, sum, mat);
        }


        return sum;
    }
    static int binary(int rowstart,int rowend,int colStart,int colEnd ,int sum, int [][]mat){
 while(rowstart<=rowend){
    int mid=colStart+(colEnd-colStart);
    if(mat[colStart].length%2==0){
        sum=sum+mat[rowstart][mid-1];
        sum=sum+mat[rowstart][mid];
        rowstart++;
    }else{
        sum=sum+mat[rowstart][mid-1];
        rowstart++;
    }

}
return sum;
    }
    public static int diagonalSum2(int[][] mat) {
        int matLen=mat.length;
        int sum=-1;
        for(int i=0;i<matLen;i++){
            sum+=mat[i][i];
            if(!(i==matLen-i)){
                sum+=mat[i][matLen-i];
            }
        }
        return sum;
    }

    public static int diagonalSum1(int[][] mat) {
        int j =mat.length-1;
        int sum =0;
        for(int i =0 ;i<mat.length;i++){
            sum+= mat[i][i];
            if(!(i==j-i)){
                sum+= mat[i][j-i];
            }
        }
        return sum;
    }
}


