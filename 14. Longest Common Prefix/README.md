# 14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

## Problem Description

Given an array of strings `strs`, find the longest common prefix string amongst them. If there is no common prefix, return an empty string `""`.

### Examples

#### Example 1:
- **Input**: `strs = ["flower","flow","flight"]`
- **Output**: `"fl"`
- **Explanation**: 
  - The longest common prefix among the strings "flower", "flow", and "flight" is "fl".

#### Example 2:
- **Input**: `strs = ["dog","racecar","car"]`
- **Output**: `""`
- **Explanation**: 
  - There is no common prefix among the strings "dog", "racecar", and "car".

### Constraints
- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists only of lowercase English letters.
