// class Solution {
//     public int maxDifference(String s) {
//         int[] mpp = new int[26];
//         int maxi = 0, mini = s.length();
//         for (char c : s.toCharArray()) {
//             mpp[c - 'a']++;
//         }
//         for (int i = 0; i < 26; i++) {
//             if (mpp[i] % 2 != 0) {
//                 maxi = Math.max(maxi, mpp[i]);
//             }
//             if (mpp[i] % 2 == 0 && mpp[i] > 0) {
//                 mini = Math.min(mini, mpp[i]);
//             }
//         }
//         return maxi - mini;
//     }
// }
class Solution {
   
    public int maxDifference(String s) {
       
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        
        int bestOdd  = Integer.MIN_VALUE; 
        int bestEven = Integer.MAX_VALUE; 

        for (int count : freq.values()) {
            if (count % 2 != 0) {            
                bestOdd = Math.max(bestOdd, count);
            } else {                           
                bestEven = Math.min(bestEven, count);
            }
        }

        
        if (bestOdd == Integer.MIN_VALUE || bestEven == Integer.MAX_VALUE) {
            return -1;
        }

        return bestOdd - bestEven;  
    }
}
