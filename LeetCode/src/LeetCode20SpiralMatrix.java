import java.util.ArrayList;
import java.util.List;

public class LeetCode20SpiralMatrix {
    public static void main(String[] args) {
//        int mat[][]={{1,2,3,4,5},
//                     {5,6,7,8,7},
//                  {9,10,11,12,55},
//                   {44,33,22,88}};
//        int mat[][]={{1,2},
//                     {3,4}};
//        int mat[][]= {{1,2,3,4},
//                      {5,6,7,8},
//                     {9,10,11,12},
//                    {13,14,15,16}};

        int mat[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     };


        //   [1,2,3,4,8,12,16,15,14,13,9,10,11,7,6,5]

        System.out.println(spiralOrder1(mat));
        //1,2,3,4,8,12,11,10,9,5,6,7
    }
//    public static List<Integer> spiralOrder(int[][] mat) {
//        int rowLen=mat.length-1;
//        int columnLen=mat[0].length;
////        int start=0;
////        int end =mat[0].length;
////        while(start<=end){
////
////        }
//        List<Integer> list=new ArrayList<>();
//        int row=0;
//        for(int i=0;i<mat.length;i++){
//            int start=0;
//            int end =mat[0].length;
//            if(row==0) {
//                while (start < end) {
//                    if (row == 0 && start < columnLen) {
//                        list.add(mat[row][start]);
//                        start++;
//                    }
//                }
//            }
//
////                for(int j=row;j<=rowLen;j++){
////                if(row>0 && row<=rowLen){
////                    list.add(mat[row][mat[row].length-1]);
////                }
////                }
//            for(int j=row;j<=rowLen;j++){
//                if(j>0 && j<=rowLen){
//                    list.add(mat[j][mat[j].length-1]);
//                    if(j==mat.length-1){
//                        for(int k=mat[row].length-1;k>=0;k--){
//                            list.add(mat[row][k]);
//                        }
//                    }
//                }
//            }
//
////                for(int k=mat[row].length-1;k>=0;k--){
////                    list.add(mat[row][k]);
////                }
//                }
//
//
//        return list;
//    }
//public static List<Integer> spiralOrder1(int[][] matrix) {
//        int rowLen = matrix.length - 1;
//        int columnLen = matrix[0].length-1;
//        boolean upforward=true;
//        List<Integer> list = new ArrayList<>();
//        for (int row = 0; row < matrix.length; row++) {
//            boolean backToForward=false;
//            if (row == 0) {
//                increment(list,0,matrix[row].length,row,matrix,true);
//            }
//
//            if (row > 0 && row <= rowLen) {
//                if(upforward) {
//                    list.add(matrix[row][matrix[row].length - 1]);
//                }
//                if (row == matrix.length - 1) {
//                    increment(list,columnLen-1,0,row,matrix,false);
//                    if(row>=1){
//                    for(int j=row;j>0;j--){
//                     list.add(matrix[j][0]);
//                    }}
//                    backToForward=true;
//                }
//            }
//            if( backToForward && list.size() < (matrix[row].length *matrix.length)) {
//                increment(list, 0, columnLen, row - 1, matrix, true);
//            }
//
//        }
//        return list;
//    }
//
//    static void increment(List list,int start,int end,int row, int [][]mat,boolean increment){
//        if(increment){
//        while (start < end) {
//                list.add(mat[row][start]);
//                start++;
//            }
//        if(row!=0 && row-1%2!=0  ){
//            increment(list,mat[row].length-2,0,row-1,mat,false);
//        }
//        }else{
//            while(end<=start){
//                list.add(mat[row][start]);
//                start--;
//            }
//        }
//    }
//
//
//
//
//    public static List<Integer> spiralOrder2(int[][] mat) {
//        int rowLen = mat.length - 1;
//        int columnLen = mat[0].length-1;
//
//        List<Integer> list = new ArrayList<>();
//        //int row=0;
//        for (int row = 0; row < mat.length; row++) {
//            int start = 0;
//            int end = mat[0].length;
//            if (row == 0) {
////                while (start < end) {
////                    if (row == 0 && start < mat[row].length) {
////                        list.add(mat[row][start]);
////                        start++;
////                    }
////                }
//                increment(list,0,mat[row].length,row,mat,true);
//            }
//
////                for(int j=row;j<=rowLen;j++){
////                if(row>0 && row<=rowLen){
////                    list.add(mat[row][mat[row].length-1]);
////                }
////                }
//            //    if(row>0 && row<=rowLen) {
////                for (int j = row; j <= rowLen; j++) {
//            if (row > 0 && row <= rowLen) {
//                list.add(mat[row][mat[row].length - 1]);
//                if (row == mat.length - 1) {
////                    for (int k = columnLen- 1; k >= 0; k--) {
////
////                    }
//                    increment(list,columnLen-1,0,row,mat,false);
//                }
//            }
//
//        }
//        return list;
//    }
//
public static List<Integer> spiralOrder1(int[][] matrix) {
        int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;
        List<Integer> result=new ArrayList<>();

        while(rowStart <= rowEnd && colStart <= colEnd){


            //right direction
                for(int i=colStart;i<=colEnd;i++){
                    result.add(matrix[rowStart][i]);
                }
                rowStart++;

            //bottom direction
            for(int i=rowStart;i<=rowEnd;i++){
                result.add(matrix[i][colEnd]);
            }
            colEnd--;


            // left Direction
            if(rowStart<=rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;


            // up Direction
            if(colStart<=colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
            }
            colStart++;

        }
        return result;
        }
}



