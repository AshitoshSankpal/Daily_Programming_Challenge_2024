
    
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

public class Q25 {

    
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    
    private boolean validate(TreeNode node, Integer min, Integer max) {
        
        if (node == null) {
            return true;
        }

        
        if (min != null && node.val <= min) {
            return false;
        }
        if (max != null && node.val >= max) {
            return false;
        }

        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Q25 solution = new Q25();
        boolean result = solution.isValidBST(root);
        System.out.println("Is the tree a valid BST? " + result);  
    }
}

    

