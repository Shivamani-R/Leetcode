class Solution {
    public String sortVowels(String s) {
         Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));

        PriorityQueue<Character> pq = new PriorityQueue<>();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                pq.offer(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                sb.append(pq.poll());
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
        
    }
}