
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

public class Q24{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null || root == p || root == q) {
            return root;
        }

       
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        
        if (left != null && right != null) {
            return root;
        }

        
        return left != null ? left : right;
    }

    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

       Q24 solution = new Q24();
        
        TreeNode p = root.left; 
        TreeNode q = root.right; 
        
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of 5 and 1 is: " + lca.val);  
    }
}
