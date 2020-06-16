// Time Complexity : O(n)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
    
    class Pair{
        TreeNode node;
        int value;
        public Pair(TreeNode node,int value){
            this.node=node;
            this.value=value;
        }
        
        public TreeNode getNode(){
            return node;
        }
        
        public int getSumVal(){
            return value;
        }
    }
    
    public int sumNumbers(TreeNode root) {
     
        if(root==null) return 0;
        Stack<Pair> stack=new Stack();
        int totalSum=0;
        int sum=0;
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                sum=sum*10+root.val;
                stack.push(new Pair(root,sum));
                root=root.left;
            }
            Pair pair=stack.pop();
            root=pair.getNode();
            if(root.left==null && root.right==null){
               totalSum+=sum; 
            }
            root=root.right;
            sum=pair.getSumVal();
        }
        return totalSum;
    }
}
