"""
Problem: Concatenation of Array
LeetCode #: 1929
Difficulty: Easy
Topic: Array

Approach:
- Python allows list concatenation using the + operator.
- Concatenating the list with itself directly forms the required result.

Time Complexity: O(n)
Space Complexity: O(n)
"""

class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        # Concatenate the list with itself
        return nums + nums
