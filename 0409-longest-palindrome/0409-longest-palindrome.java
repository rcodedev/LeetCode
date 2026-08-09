class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[128];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        int ans = 0;
        boolean oddfound = false;
        for (int f : freq) {
            if (f % 2 == 0) {
                ans += f;
            } else {
                ans += f - 1;
                oddfound = true;
            }
        }
        if (oddfound)
            ans++;
        return ans;
    }
}