//package Stack;
//
//import java.util.Stack;
//
///**
// * @author JIANXIN.GUO
// * @date 2019-05-17 19:55
// **/
//public class BasicCalculator {
//    public int calculate(String s) {
//        Stack<Integer> nStack = new Stack();
//        Stack<String> sStack = new Stack();
//
//        char[] chars = s.toCharArray();
//
//        for(int i = 0; i < chars.length; i++){
//            int chr=chars[i];
//            if(chr<48 || chr>57){
//                String a = String.valueOf(chars[i]);
//                if(level1.contains(a)){
//                    sStack.push(a);
//                }else if (level2.contains(a)){
//
//                }
//            }else {
//                nStack.push(Integer.valueOf(String.valueOf(chars[i])));
//            }
//            String a = String.valueOf(chars[i]);
//
//        }
//
//    }
//
//    public Integer calculator(Integer a, Integer b, String s){
//
//    }
//
//
//    private String level1 = "+-";
//    private String level2 = "(";
//    private String level3 = ")";
//
//}
