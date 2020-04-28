package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-07 16:46
 **/
public class binaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root){
            return result;
        }
        if (root.left != null){
            result.addAll(inorderTraversal(root.left));
        }
        result.add(root.val);
        if (root.right != null){
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }

}
