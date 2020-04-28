package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author JIANXIN.GUO
 * @date 2020-04-07 17:48
 **/
public class binaryTreelevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root)
            return result;
        result.add(Arrays.asList(root.val));
        List<TreeNode> levelTreeNode = getLevelTreeNode(Arrays.asList(root));
        while (!levelTreeNode.isEmpty()){
            result.add(eachLevelOrder(levelTreeNode));
            levelTreeNode = getLevelTreeNode(levelTreeNode);
        }
        return result;
    }

    public List<TreeNode> getLevelTreeNode(List<TreeNode> roots){
        List<TreeNode> treeNodeList = new ArrayList<>();
        roots.stream().forEach(root ->{
            if (null != root.left)
                treeNodeList.add(root.left);
            if (null != root.right)
                treeNodeList.add(root.right);
        });
        return treeNodeList;
    }

    public List<Integer> eachLevelOrder(List<TreeNode> treeNodeList){
        List<Integer> result = new ArrayList<>();
        treeNodeList.stream().forEach(treeNode -> {
            result.add(treeNode.val);
        });
        return result;
    }
}
