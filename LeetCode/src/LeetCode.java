//https://leetcode.com/problems/reverse-prefix-of-word/
//6ms
public class LeetCode {
    public static void main(String[] args) {
        System.out.println(reversePrefix("xyxzxe", 'z'));
    }

    static String reversePrefix(String word, char ch) {
       char[] words = word.toCharArray();
//
//        String result = "";
//        for (int i = 0; i < words.length; i++) {
//            if (words[i] == ch) {
//                for (int j = i; j >= 0; j--) {
//                    result += words[j];
//                }
//                return result + word.substring(i+1, words.length);
//            }
//
//        }
//        return word;//5ms

        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i] == ch) {
                StringBuilder str = new StringBuilder(word.substring(0,i+1));
                return str.reverse().append(word.substring(i+1, word.length())).toString();
               }

        }
        return word;//0ms

    }
}
