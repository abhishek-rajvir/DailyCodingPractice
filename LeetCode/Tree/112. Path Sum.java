Solution 1 :
Runtime 0ms
Beats 100.00%

Memory 45.17MB
Beats 28.77%

public boolean recursiveFind(TreeNode node,int sum, int target) {
    // edge case we are currently pass the leaf means no node to compare
    if(node==null) return false;
    // increment the current val to sum of from previous node values
    sum+= node.val;
    // wheter its leaf node
    boolean next = node.left==null && node.right == null;
    // if its leaf and sum==target tree satisfies the condition
    if(sum==target && next ) return true;
    return 
        // else we look in left and right subtree whether either of them satisfy the condition
        recursiveFind(node.left,sum,target) || 
        recursiveFind(node.right,sum,target);
}

public boolean hasPathSum(TreeNode root, int targetSum) {
  //  call the recursive method
    return recursiveFind(root,0,targetSum);
}
