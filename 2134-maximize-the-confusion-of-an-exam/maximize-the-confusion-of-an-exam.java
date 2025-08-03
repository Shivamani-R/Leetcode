class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(
            maxConsecutiveChar(answerKey, k, 'T'),
            maxConsecutiveChar(answerKey, k, 'F')
        );
    }

    private int maxConsecutiveChar(String answerKey, int k, char target) {
        int left = 0, maxLen = 0, flipCount = 0;

        for (int right = 0; right < answerKey.length(); ++right) {
            if (answerKey.charAt(right) != target) {
                flipCount++;
            }

            while (flipCount > k) {
                if (answerKey.charAt(left) != target) {
                    flipCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
