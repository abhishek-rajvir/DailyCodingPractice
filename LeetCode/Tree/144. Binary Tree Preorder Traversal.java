Solution 1
Runtime 0ms
Beats 100.00%
Memory 43.10MB
Beats 84.96%

public List<Integer> preorderTraversal(TreeNode root) {
    // list to store the values
    List<Integer> ls = new ArrayList<>();
    // invoke method
    traverse(root,ls);
    return ls;
}

// recursive method for pre-order traversel
public void traverse(TreeNode node,List<Integer> ls){
    // if node null no need to append
    if(node == null) return ;
    // append root val
    ls.add(node.val);
    // append left child
    traverse(node.left,ls);
    // append right child
    traverse(node.right,ls);
}
