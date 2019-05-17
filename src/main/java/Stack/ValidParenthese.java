package Stack;

import java.util.Stack;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-17 10:34
 **/
public class ValidParenthese {
    class Solution {
        public boolean isValid(String s) {
            for (int i = 0; i < s.length(); i++) {
                String c = String.valueOf(s.charAt(i));
                if (lifeParenthese.contains(c)){
                    stringStack.push(c);
                }else if (rightParenthese.contains(c)){
                    if (stringStack.size() == 0){
                        return false;
                    }
                    String pop = stringStack.pop();
                    if (lifeParenthese.indexOf(pop) == rightParenthese.indexOf(c)){

                    }else {
                        return false;
                    }
                }
            }
            if (stringStack.size() != 0){
                return false;
            }
            return true;
        }

        private Stack<String> stringStack =  new Stack<>();

        private String lifeParenthese = "{([";
        private String rightParenthese = "})]";

    }
}
