package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-07 16:54
 **/
public class binaryTreeInorderTraversalByStack {
    //TODO
    Stack<Integer> stack = new Stack<>();
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (null == root)
            return result;
        stack.push(root.val);
        if (root.left != null){
            result.addAll(inorderTraversal(root.left));
        }
        result.add(stack.pop());
        if (root.right != null){
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
}
