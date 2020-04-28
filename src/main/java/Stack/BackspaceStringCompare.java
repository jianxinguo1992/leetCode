package Stack;

import java.util.Stack;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-17 17:45
 **/
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        Stack<String> fristStack  = StringPushStack(S);
        Stack<String> secondStack = StringPushStack(T);

        if (fristStack.size() == secondStack.size()){
            int size = fristStack.size();
            for (int i = 0; i < size; i++) {
                if (fristStack.pop().equals(secondStack.pop())){

                }else {
                    return false;
                }
            }
        }else {
            return false;
        }

        return true;
    }

    private static Stack<String> StringPushStack(String s){
        Stack<String> characterStack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String a = String.valueOf(chars[i]);
            if (!a.equals("#")){
                characterStack.push(a);
            }else {
                try {
                    characterStack.pop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return characterStack;
    }
}
