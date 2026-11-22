import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Finds the length of the longest substring without repeating characters.
     * 
     * @param s The input string.
     * @return The length of the longest substring.
     */
    public int lengthOfLongestSubstring(String s) {
        // Map stores the character and its last encountered index.
        Map<Character, Integer> map = new HashMap<>();
        
        int maxLength = 0;
        // The left pointer defines the start of the current window [left, right].
        int left = 0;
        
        // The right pointer expands the window.
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // 1. Check if the character was seen before and is inside the current window.
            // (i.e., its last index is >= the current window start 'left')
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                // Move the left boundary to the position immediately after the last occurrence.
                // This effectively slides the window past the duplicate.
                left = map.get(currentChar) + 1;
            }
            
            // 2. Update the character's latest index.
            map.put(currentChar, right);
            
            // 3. Update the maximum length.
            // Current window length is (right - left + 1).
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
