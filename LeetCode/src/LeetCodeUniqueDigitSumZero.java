public class LeetCodeUniqueDigitSumZero {
    public static void main(String[] args) {

    }
    static int [] sumOfZero(int n){
        int start=0;int end=n-1;
        int digit=1;
        int num[]=new int[n];
        while(start<end){
            num[start++]=digit;
            num[end--]=-digit;
            digit++;
        }
        return num;
    }

    static int [] sumOfZero1(int n){
        int num[]=new int [n];
        for(int i=0;i<n;i++){
            num[i]=i*2-n-1;
        }
        return num;
    }
}
