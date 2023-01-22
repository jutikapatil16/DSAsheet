import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        char[] arr = s.toCharArray();
        int max = 0;
        for (char c: arr) {
            while (queue.contains(c)) {
                queue.remove();
            }
            queue.add(c);
            max = Math.max(queue.size(), max);
        }
        return max;
    }
}