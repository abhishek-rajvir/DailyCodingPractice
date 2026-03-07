Solution with recursion to find whether tree is symmetric

Runtime- 0ms
Beats- 100.00%
Memory- 43.23MB
Beats- 96.28%

Approach : pass node from left and right half and keep comparing while all child nodes are mirror
  
public boolean isSymmetric(TreeNode root) {
    // invoke the isMirror method pass left and right node
    // This method will keep comparing the values of the given nodes till either is null
    return recursiveIsMirror(root.left,root.right);
}

public boolean recursiveIsMirror(TreeNode p,TreeNode q){
    
    // if both are null its mirror , if only 1 is null then not
    if (p==null || q==null) return (p==null && q==null);

    // if val of both are same
    // & child of both are same its valid mirror
    return (p.val == q.val) &&
            recursiveIsMirror(p.left,q.right) &&
            recursiveIsMirror(p.right,q.left);
}
