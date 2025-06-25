class Solution {
    public String intToRoman(int num) {
        String[] romanSymbols = new String[]{"M", "CM", "D", "CD", "C", "XC" , "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5 ,4, 1};

        StringBuilder result = new StringBuilder();
        for(int i=0; i< values.length;i++){
            if(num == 0) break;

            if(num >= values[i]){
                result.append(romanSymbols[i]);
                num -= values[i];
                i--;
            }
        }
        return result.toString();        
    }
}