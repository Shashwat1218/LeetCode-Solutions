# 1071. Greatest Common Divisor of Strings

## Description

For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

### Examples

#### Example 1:
- **Input**: `str1 = "ABCABC", str2 = "ABC"`
- **Output**: `"ABC"`
- **Explanation**:
  - The largest string x that divides both "ABCABC" and "ABC" is "ABC".

#### Example 2:
- **Input**: `str1 = "ABABAB", str2 = "ABAB"`
- **Output**: `"AB"`
- **Explanation**:
  - The largest string x that divides both "ABABAB" and "ABAB" is "AB".

#### Example 3:
- **Input**: `str1 = "LEET", str2 = "CODE"`
- **Output**: `""`
- **Explanation**:
  - There is no common divisor string that divides both "LEET" and "CODE".

### Constraints

- 1 <= str1.length, str2.length <= 1000
- str1 and str2 consist of English uppercase letters
