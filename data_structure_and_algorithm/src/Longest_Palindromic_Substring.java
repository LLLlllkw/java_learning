import java.util.ArrayList;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        String s = "aaabaaaa";
        System.out.println(Longest_Palindromic_Substring.longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == ""|| s.length()<1) {
            return "";
        } else {
            int max_begin = 0;
            int max_end = 0;
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                ArrayList<Integer> arrayList = find_index(chars, chars[i], i);
                for (int q = arrayList.size()-1; arrayList.size() != 0 && q >=0; q--) {
                    int find = arrayList.get(q);
                    if(find-i<=max_end-max_begin){break;}
                    //System.out.println(i+"i");
                    //System.out.println(find+"find");
                    if (Check_Palindromic(s, i, find) && ((find - i) > (max_end - max_begin))) {
                        max_begin = i;
                        max_end = find;
                        //System.out.println(max_begin);
                        //System.out.println(max_end);
                        break;
                    }
                }
            }
            char[] newchararray = new char[max_end - max_begin + 1];
            int index = 0;
            for (int i = max_begin; i <= max_end; i++) {
                newchararray[index] = chars[i];
                index++;
            }

            return String.valueOf(newchararray);
        }
    }

    public static  ArrayList<Integer> find_index(char[] chars, char object, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = index + 1; i < chars.length; i++) {
            if (chars[i] == object) {
                list.add(i);
            }
        }
        //System.out.println(list);
        return list;
    }

    public static boolean Check_Palindromic(String s, int begin, int end) {
        char[] chars = s.toCharArray();
        boolean flag = true;
        for (; begin < end; begin++) {
            if (chars[begin] == chars[end]) {
                end--;
                continue;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
