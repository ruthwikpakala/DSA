import java.util.*;
class Solution {
List<Integer> fl;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        fl=new ArrayList<>();
        List<List<Integer>> al=new ArrayList();
        List<Integer> cl=new ArrayList<>();
        helper(root,al,cl,targetSum);
        System.out.print(cl);
        return al;
    }
    void helper(TreeNode root,List<List<Integer>> al,List<Integer> cl,int sum)
    {
        if(root==null) return;
        cl.add(root.val);
        helper(root.left,al,cl,sum-root.val);
        helper(root.right,al,cl,sum-root.val);
        if(sum==root.val&&root.left==null&&root.right==null)
        {
            al.add(new ArrayList<>(cl));
        }
        
        cl.remove(cl.size()-1);
         
    }
}
