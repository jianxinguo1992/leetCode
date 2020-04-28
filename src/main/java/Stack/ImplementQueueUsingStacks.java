package Stack;

import java.util.Stack;

/**
 * @author JIANXIN.GUO
 * @date 2019-05-17 15:50
 **/
public class ImplementQueueUsingStacks {
    class MyQueue {


        private Stack<Integer> inputStack;
        private Stack<Integer> outputStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            inputStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (outputStack.size() == 0){
                if (inputStack.size() == 0){
                    throw new RuntimeException("stackQueue is empty!");
                }else {
                    input2Output();
                }
            }
            return outputStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (outputStack.size() != 0){
                return outputStack.peek();
            }else if (inputStack.size() != 0){
                input2Output();
                return outputStack.peek();
            }else {
                throw new RuntimeException("stackQueue is empty!");
            }
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if (inputStack.size() == 0 && outputStack.size() == 0){
                return true;
            }
            return false;
        }


        private void input2Output(){
            int size = inputStack.size();
            for (int i = 0; i < size; i++) {
                outputStack.push(inputStack.pop());
            }
        }
    }
}
