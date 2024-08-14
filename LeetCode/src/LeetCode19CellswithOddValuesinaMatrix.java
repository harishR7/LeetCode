public class LeetCode19CellswithOddValuesinaMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int [][]indices = {{0,1},{1,1}};
        System.out.println(findOddvale(m,n,indices));

    }
    static  int findOddvale(int m,int n,int [][] mat){
        int [][] arr=new int[m][n];
        for(int k=0;k<mat.length;k++){


            for(int i=0;i<m;i++){
                arr[mat[k][0]][i]++;
            }
            for(int j=0;j<n;j++){
                arr[j][mat[k][1]]++;
            }
        }
        return -1;
    }
}
