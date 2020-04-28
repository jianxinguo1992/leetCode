package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-07 16:40
 **/
public class binaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (null == root){
            return result;
        }
        result.add(root.val);
        if (root.left == null) {

        } else {
            result.addAll(preorderTraversal(root.left));
        }
        if (root.right == null) {

        } else {
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }


}
