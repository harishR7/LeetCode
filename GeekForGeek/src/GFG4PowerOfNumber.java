public class GFG4PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(12,21));
    }

    static long power(int N,int R)
    {
       if(R==0){
           return 1;
       }
       Long mod = 1000000007L;
       Long temp= power(N,R/2);

       if(R%2==0){
           return (temp*temp)%mod;
       }else{
           return ((temp*temp)%mod *N)%mod;
       }

    }

}
