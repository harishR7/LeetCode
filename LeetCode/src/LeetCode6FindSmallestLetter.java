//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class LeetCode6FindSmallestLetter {
    public static void main(String[] args) {
        char []letters ={'c','f','j'};
        char target='d';
        System.out.println(smallestLetter(letters,target));
    }
    static char smallestLetter(char [] arr,char letter){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letter<arr[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return arr[start];
        //return arr[start % arr.length];
    }
}
