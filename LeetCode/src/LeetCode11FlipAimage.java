public class LeetCode11FlipAimage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(flipAndInvertImage(image));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            swap(image[i],0,image[i].length-1);
        }
        return image;
    }
    static void swap(int [] arr ,int start,int end){
        while(start<end) {
            int temp = arr[start]^1;
            arr[start] = arr[end] == 0 ? 1 : 0;
            start++;
            arr[end] = temp == 0 ? 1 : 0;
            end--;
        }if(start==end) {
            arr[start] = arr[start] == 0 ? 1 : 0;
        }

        }
    }
