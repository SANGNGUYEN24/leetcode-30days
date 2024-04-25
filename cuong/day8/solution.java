class Solution {
    String smallestString = null;
    
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return smallestString;
    }
    
    private void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        

        sb.insert(0, (char)('a' + node.val));
        
        if (node.left == null && node.right == null) {
            String curr = sb.toString();
            if (smallestString == null || curr.compareTo(smallestString) < 0) {
                smallestString = curr;
            }
        }
        
        dfs(node.left, sb);
        dfs(node.right, sb);
        
        sb.deleteCharAt(0);
    }
}