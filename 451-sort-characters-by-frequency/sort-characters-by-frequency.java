class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> x = new HashMap<>();
        for (char c : s.toCharArray()) {
            x.put(c, x.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> y =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        y.addAll(x.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!y.isEmpty()) {
            Map.Entry<Character, Integer> entry = y.poll();
            char ch = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
        
