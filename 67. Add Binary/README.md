# 67. Add Binary

Given two binary strings `a` and `b`, return their sum as a binary string.

## Problem Description

For two given binary strings `a` and `b`, calculate their sum and return the result as a binary string.

### Examples

#### Example 1:
- **Input**: `a = "11"`, `b = "1"`
- **Output**: `"100"`
- **Explanation**: 
  - 11 in binary is 3 in decimal.
  - 1 in binary is 1 in decimal.
  - Sum in decimal is 3 + 1 = 4.
  - 4 in binary is 100.

#### Example 2:
- **Input**: `a = "1010"`, `b = "1011"`
- **Output**: `"10101"`
- **Explanation**: 
  - 1010 in binary is 10 in decimal.
  - 1011 in binary is 11 in decimal.
  - Sum in decimal is 10 + 11 = 21.
  - 21 in binary is 10101.

### Constraints
- `1 <= a.length, b.length <= 10^4`
- `a` and `b` consist only of '0' or '1' characters.
- Each string does not contain leading zeros except for the zero itself.
