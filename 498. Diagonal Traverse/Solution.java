
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m * n];
        int k = 0;
        
        List<Integer> intermediate = new ArrayList<>();
        
        for (int d = 0; d < m + n - 1; d++) {
            intermediate.clear();
            
            int r = d < n ? 0 : d - n + 1;
            int c = d < n ? d : n - 1;
            
            while (r < m && c > -1) {
                intermediate.add(mat[r][c]);
                r++;
                c--;
            }
            
            if (d % 2 == 0) {
                for (int i = intermediate.size() - 1; i >= 0; i--) {
                    result[k++] = intermediate.get(i);
                }
            } else {
                for (int i = 0; i < intermediate.size(); i++) {
                    result[k++] = intermediate.get(i);
                }
            }
        }      
        return result;
    }
}
