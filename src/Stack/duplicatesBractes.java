package Stack;

import java.util.Scanner;
import java.util.Stack;

public class duplicatesBractes {
    static boolean solve(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(st.peek() == '('){
                    return true;
                }else {
                    while (st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else {
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(solve(str));
    }
}
