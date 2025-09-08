class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> x = new HashMap<>();
        for(int num:nums){
            x.put(num,x.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> y = 
        new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> ss : x.entrySet()){
            y.add(ss);
            if(y.size()>k){
                y.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = y.poll().getKey();
        }
        return res;
    }
}