package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-07 17:29
 **/
public class binaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        if (root.left != null){
            result.addAll(postorderTraversal(root.left));
        }
        if (root.right != null){
            result.addAll(postorderTraversal(root.right));
        }
        result.add(root.val);

        return result;
    }
}
