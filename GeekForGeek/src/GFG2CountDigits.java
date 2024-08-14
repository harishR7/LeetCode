import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GFG2CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(22074));
    }

    static int countDigits(int N) {

        // code here
        int count = 0;
        List<Integer> list = new ArrayList<>();
        int temp = N;
        while (temp > 0) {
            if(temp % 10!=0) {
                list.add(temp % 10);
            }
            temp /= 10;
        }

        for (int i = 0; i < list.size(); i++) {
            if (N % list.get(i)== 0) {
                count++;
            }
        }
        return count;
    }
}
