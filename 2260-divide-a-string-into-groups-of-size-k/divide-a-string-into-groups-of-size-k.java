public class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i += k) {
           
            int end = Math.min(i + k, s.length());
            String part = s.substring(i, end);

           
            while (part.length() < k) {
                part += fill;
            }

            result.add(part);
        }

        
        return result.toArray(new String[0]);
    
    }
}
