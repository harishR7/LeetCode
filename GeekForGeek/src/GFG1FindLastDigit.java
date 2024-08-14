public class GFG1FindLastDigit {
    public static void main(String[] args) {
        System.out.println(findLastDigit("3875","100006"));
    }

    static int findLastDigit(String a,String b){
        if((a.length()==1 && a.equals("1"))&&(b.length()==1 && a.equals("1"))){
            return 1;
        } else if (a.length()==1 && a.equals("0")) {
            return 0;
        } else if (b.length()==1 && a.equals("0")) {
            return 1;
        }
        int numA=(a.charAt(a.length()-1))-'0';
        int numB=0;
        for(int i=0; i<b.length();i++){
            numB=numB*10+(b.charAt(i))-'0';
            numB%=4;
        }
        if(numB==0){
            numB=4;
        }
        int result=(int)Math.pow(numA,numB);
        return result%10;
        //return -1;
    }
}
