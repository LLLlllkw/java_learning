import org.w3c.dom.ls.LSOutput;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Hashtable;

public class NPR {
    public static void main(String[] args) {
        NPR test = new NPR();
        System.out.println(test.infix_2_NPR("a+b*c"));
    }

    public String infix_2_NPR(String s) {
        Stack<Character> stack1 = new Stack<>();
        ArrayList<Character> arrayList = new ArrayList<>();
        char[] chars = s.toCharArray();
        Hashtable<Character, Integer> hashtable = new Hashtable();
        hashtable.put('(', 1);
        hashtable.put('+', 2);
        hashtable.put('-', 2);
        hashtable.put('*', 3);
        hashtable.put('/', 3);
        for (int i = 0; i < chars.length; i++) {
            if (hashtable.containsKey(chars[i])) {
                if (stack1.isEmpty() || hashtable.get(chars[i]) > hashtable.get(stack1.peek())) {
                    stack1.push(chars[i]);
                    continue;
                }
                if (hashtable.get(chars[i]) <= hashtable.get(stack1.peek())) {
                    while (stack1.isEmpty() || hashtable.get(stack1.peek()) <= hashtable.get(chars[i])) {
                        arrayList.add(stack1.pop());
                    }
                }
            }
            if (chars[i] == ')') {
                while (stack1.peek() != '(') {
                    arrayList.add(stack1.pop());
                }
                stack1.pop();
            }
            if (!hashtable.containsKey(chars[i]) && chars[i]!=')'){
                arrayList.add(chars[i]);
            }
        }

        while (!stack1.isEmpty()) {
            arrayList.add(stack1.pop());
        }
        String result = "";
        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).toString();
        }
        return result;
    }


}


