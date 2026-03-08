Solution 1: Recursion O(h)

Runtime 0ms
Beats 100.00%
Memory 42.97MB
Beats 92.81%

Approach:- Create a recursive method which adds curr node val to list
           First add left then right and root val
  
public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ls = new ArrayList<>();
    traverse(root,ls);
    return ls;
}

public void traverse(TreeNode node, List<Integer> ls){
    if(node != null){
        traverse(node.left,ls);
        traverse(node.right,ls);
        ls.add(node.val);
    }
}
