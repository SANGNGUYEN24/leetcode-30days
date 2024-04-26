class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0, left = 0, right = 0;
        HashSet<Character> set = new HashSet<>();
        
        while (right < n) {
            char currChar = s.charAt(right);
            if (!set.contains(currChar)) {
                set.add(currChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}