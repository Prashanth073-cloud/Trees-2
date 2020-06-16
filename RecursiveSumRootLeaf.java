// Time Complexity : O(n). n is the number of nodes in a tree
// Space Complexity : O(n).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int sumNumbers(TreeNode root) {
         
        return recursive(root,0);
    }
    
    private int recursive(TreeNode root,int sum){
        if(root==null) return 0;
        
        if(root.right==null && root.left==null) return sum*10+root.val;
        return recursive(root.left,sum*10+root.val)+recursive(root.right,sum*10+root.val);
            
    
}
    
}
