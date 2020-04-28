package tree;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-08 13:38
 **/
public class binaryTreeMaxDepth {

    private int result;

    public int maxDepth(TreeNode root) {
        if (null == root)
            return 0;
        return getTreeNodeMaxDepth(root, 1);

    }

    public int getTreeNodeMaxDepth(TreeNode root, int depth){
        if (null == root.right &&  null == root.left)
            return depth;
        if (root.left != null){
            result = Math.max(result, getTreeNodeMaxDepth(root.left, depth+1));
        }
        if (root.right != null){
            result = Math.max(result, getTreeNodeMaxDepth(root.right, depth+1));
        }
        return result;
    }
}
