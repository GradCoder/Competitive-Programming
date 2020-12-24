
class Solution {
    int level = 0;
    public int sumEvenGrandparent(TreeNode root) {
        int n = ReturnIntegers(root,0);
        return n;
    }
    
    public int ReturnIntegers(TreeNode root, int val)
    {
        if(root==null)
            return val;
        if(root.val%2==0)
        {
            if(root.left!=null && root.left.left!=null)
            {
                val = val + root.left.left.val;
            }
            if(root.left!=null && root.left.right!=null)
            {
                val = val + root.left.right.val;
            }
            if(root.right!=null && root.right.left!=null)
            {
                val = val + root.right.left.val;
            }
            if(root.right!=null && root.right.right!=null)
            {
                val = val + root.right.right.val;
            }
        }
        val = ReturnIntegers(root.left, val);
        val = ReturnIntegers(root.right, val);
        return val;
    }
}
