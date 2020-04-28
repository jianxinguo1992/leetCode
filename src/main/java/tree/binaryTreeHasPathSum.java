package tree;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-08 14:57
 **/
public class binaryTreeHasPathSum {

    private boolean hasPathSum = false;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        sum = sum - root.val;
        if (root.left != null)
            hasPathSum(root.left, sum);
        if (root.right != null)
            hasPathSum(root.right, sum);
        if (sum == 0 && root.right == null && root.left == null)
            hasPathSum =  true;
        return hasPathSum;
    }

    public static void main(String[] args) {
        double a= 1;
        for (int i = 0; i < 8; i++) {
            a=a*1.05;
        }
        System.out.println(a);
    }


}
