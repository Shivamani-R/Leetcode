class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finall = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null){
            return finall;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int num = queue.size();
            List<Integer> subfinall = new LinkedList<Integer>();

            for(int i=0;i<num;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer(queue.peek().right);
                subfinall.add(queue.poll().val);
            }
            finall.add(subfinall);
        }
        return finall;
    }
}