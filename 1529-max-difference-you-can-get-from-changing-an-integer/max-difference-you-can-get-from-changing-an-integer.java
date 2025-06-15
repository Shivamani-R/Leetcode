class Solution {
    public int maxDiff(int num) {
        String s = String.valueOf(num);

        char maxReplace = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                maxReplace = c;
                break;
            }
        }
        String maxStr = (maxReplace == ' ') ? s : s.replace(maxReplace, '9');

        char minReplace = ' ';
        char[] chars = s.toCharArray();
        if (chars[0] != '1') {
            minReplace = chars[0];
            s = s.replace(minReplace, '1');
        } else {
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != '0' && chars[i] != '1') {
                    minReplace = chars[i];
                    break;
                }
            }
            if (minReplace != ' ') {
                s = s.replace(minReplace, '0');
            }
        }

        int a = Integer.parseInt(maxStr);
        int b = Integer.parseInt(s);
        return a - b;
    }
}
