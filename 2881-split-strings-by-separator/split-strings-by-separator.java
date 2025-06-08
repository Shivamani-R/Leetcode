class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for (String word : words) { 
            for (String part : word.split("\\" + separator)) {
                if (!part.isEmpty()) {
                    result.add(part);
                }
            }
        }
        
        return result;
    }
}