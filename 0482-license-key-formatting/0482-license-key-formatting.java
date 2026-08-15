class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String temp = "", ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != '-')
                temp = temp + Character.toUpperCase(ch);
        }
        int c = k;
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (c == 0) {
                c = k;
                ans = '-' + ans;
            }
            ans = ch + ans;
            c--;
        }
        return ans;
    }
}