package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-08 14:06
 **/
public class binaryTreeIsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    public boolean isMirror(TreeNode one, TreeNode two){
        if (one == null && two == null)
            return true;
        if (one == null || two == null)
            return false;
        return (one.val == two.val) && (isMirror(one.left, two.right)) && (isMirror(one.right, two.left));
    }

}
