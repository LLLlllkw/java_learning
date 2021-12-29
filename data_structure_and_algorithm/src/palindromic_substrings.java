import java.util.ArrayList;

public class palindromic_substrings {
    public static void main(String[] args) {
        palindromic_substrings test = new palindromic_substrings();
        String s = "abccba";
        int result = test.countSubstrings(s);
        System.out.println(result);
    }

    public int countSubstrings(String s) {
        int [] dp = new int[s.length()+1];
        dp[0] = 0;
        for (int i = 1; i < s.length()+1; i++) {
          dp[i] = dp[i-1]+check_palindromic(s,i-1);
        }
        for (int i = 0; i <dp.length ; i++) {
            System.out.println(dp[i]);
        }
        return dp[s.length()];
    }

    public int check_palindromic(String s, int obj_index) {
        int count = 1; //把自己本身直接加上
        char[] chars = s.toCharArray();
        for (int i = 0; i < obj_index; i++) {
            if (chars[i]==chars[obj_index]) {
                int q = i;
                int p = obj_index;
                while (q <= p) {
                    if (chars[q]==chars[p]) {
                    }
                    else {break;}
                    q++;
                    p--;
                }
                if (q >= p) {
                    count++;
                }
            }
        }
        return count;
    }
}
