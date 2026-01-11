# Concatenation of Array

**LeetCode #1929**  
**Difficulty:** Easy  
**Topic:** Array  

---

## 🧩 Problem Description

Given an integer array `nums` of length `n`, create an array `ans` of length
`2n` such that:

- `ans[i] == nums[i]`
- `ans[i + n] == nums[i]`

for `0 <= i < n` (0-indexed).

In other words, the array `ans` is formed by concatenating the array `nums`
with itself.

Return the resulting array `ans`.

---

## 📌 Example 1

**Input:**
nums = [1,2,1]

**Output:**
[1, 2, 1, 1, 2, 1]

**Explanation:**
ans = [nums[0], nums[1], nums[2], nums[0], nums[1], nums[2]]
ans = [1, 2, 1, 1, 2, 1]

---

## 📌 Example 2

**Input:**
nums = [1, 3, 2, 1]

**Output:**
[1, 3, 2, 1, 1, 3, 2, 1]

**Explanation:**
ans = [nums[0], nums[1], nums[2], nums[3],
nums[0], nums[1], nums[2], nums[3]]
ans = [1, 3, 2, 1, 1, 3, 2, 1]

---

## ⛓ Constraints
- `n == nums.length`
- `1 <= n <= 1000`
- `1 <= nums[i] <= 1000`

---

## 💻 Solutions
- 👉 [Java Solution](Solution.java)
- 👉 [Python Solution](Solution.py)
