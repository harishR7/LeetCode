public class Q10SeacrchInString {
    public static void main(String[] args) {
        String str="Kunal Pandey";
        char ch='v';
       System.out.println(searchChar(str,ch));
    }

    public static boolean searchChar(String str,char ch){
        if (str.length()==0) {
            return false;
        }
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==ch){
//                return true;
//            }
//        }
        for(char chr:str.toCharArray()){
            if(chr==ch){
                return true;
            }
        }
        return false;
    }
    }
