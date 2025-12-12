class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> list = new ArrayList<>();
        generate(n,"", list);
        return list;
    }

    public static void generate(int n, String curr, ArrayList<String> result) {
        if (curr.length() == n) {
            result.add(curr);
            return;
        }

        if (curr.isEmpty() || curr.charAt(curr.length() - 1) != '0') {
            generate(n, curr + "0", result);
        }

        generate(n, curr + "1", result);
    }
}