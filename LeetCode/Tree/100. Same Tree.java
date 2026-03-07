Solution with recursion O(n)

Runtime 0ms
Beats 100.00%
Memory 42.59MB
Beats 96.94%

public boolean isSameTree(TreeNode p, TreeNode q) {
    return recursiveCompare(p,q);
}
public boolean recursiveCompare(TreeNode p,TreeNode q){
    if(p==null || q==null){
        return p==null && q==null;
    }
    return (p.val == q.val) 
        ? (recursiveCompare(p.left,q.left) &&
                recursiveCompare(p.right,q.right))
        : false;
}
