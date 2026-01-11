/*
Problem: Concatenation of Array
LeetCode #: 1929
Difficulty: Easy
Topic: Array

Approach:
- Find the length of the input array.
- Create a new array of size 2 * length.
- Iterate from index 0 to 2 * length - 1.
- For the first half, copy elements directly from nums.
- For the second half, copy elements from nums using (i - length).

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] getConcatenation(int[] nums) {

        // Length of the original array
        int len = nums.length;

        // Create a new array of size 2 * len
        int[] ans = new int[2 * len];

        // Loop through the new array
        for (int i = 0; i < 2 * len; i++) {

            // If index is in the first half, copy directly
            if (i < len) {
                ans[i] = nums[i];
            }
            // If index is in the second half, copy using (i - len)
            else {
                ans[i] = nums[i - len];
            }
        }

        // Return the concatenated array
        return ans;
    }
}
