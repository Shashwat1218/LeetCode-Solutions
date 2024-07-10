# 11. Container With Most Water

## Description

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

### Examples
![Diagram](Image/1.png)
#### Example 1:
- **Input**: `height = [1,8,6,2,5,4,8,3,7]`
- **Output**: `49`
- **Explanation**:
  - The maximum area is formed between the lines at index 1 (height 8) and index 8 (height 7), resulting in an area of 49.

#### Example 2:
- **Input**: `height = [1,1]`
- **Output**: `1`
- **Explanation**:
  - Only two lines are present, and the maximum area that can be formed is 1.

### Constraints

- 2 <= n <= 10^5
- 0 <= height[i] <= 10^4
