class Solution {
    public int countAsterisks(String s) {
        boolean insideBar = false;
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '|') {
                insideBar = !insideBar; 
            } else if (c == '*' && !insideBar) {
                count++;
            }
        }

        return count;
        
    }
}