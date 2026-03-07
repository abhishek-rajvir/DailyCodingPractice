Solution 1: recursion
Runtime 4ms
Beats66.33%
  
Memory 82.19MB
Beats 51.37%

Approach traverse both sides and keep counter of depth return min depth from both ends
  
public int minDepth(TreeNode root) {
    if(root == null) return 0;
    
    // store min depth of left and right
    // 1 + acts as current depth avoid need for new argument
    int l = 1 + minDepth(root.left);
    int r = 1 + minDepth(root.right);

    // if left node is null means the min depth is on right side and visa versa
    if(root.left == null) return r;
    if(root.right == null) return l;

    // if both are not null means the tree has nodes on left and right
    // find the lowest depth from  each
    return Math.min(l,r);
}
