class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finall = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return finall;
        }

        queue.offer(root);

        while (!queue.isEmpty()) {
            int num = queue.size();
            List<Integer> subfinall = new ArrayList<>();

            for (int i = 0; i < num; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                subfinall.add(node.val);
            }

            finall.add(subfinall);
        }

        return finall;
    }
}
