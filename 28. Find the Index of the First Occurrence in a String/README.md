# 28. Find the Index of the First Occurrence in a String

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or -1 if `needle` is not part of `haystack`.

## Problem Description

For two given strings `needle` and `haystack`, determine the index of the first occurrence of `needle` within `haystack`. If `needle` does not occur within `haystack`, return -1.

### Examples

#### Example 1:
- **Input**: `haystack = "sadbutsad"`, `needle = "sad"`
- **Output**: `0`
- **Explanation**: 
  - The string "sad" occurs at index 0 and 6 in "sadbutsad".
  - The first occurrence is at index 0, so the output is 0.

#### Example 2:
- **Input**: `haystack = "leetcode"`, `needle = "leeto"`
- **Output**: `-1`
- **Explanation**: 
  - The string "leeto" does not occur in "leetcode".
  - Therefore, the output is -1.

### Constraints
- `1 <= haystack.length, needle.length <= 10^4`
- `haystack` and `needle` consist of only lowercase English characters.
