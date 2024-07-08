
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            return false;
        }
        if (flowerbed.length == 1) {
            if ((flowerbed[0] == 0 && n <= 1) || (flowerbed[0] == 1 && n == 0)) {
                return true;
            } else {
                return false;
            }
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    if (n <= 0) return true;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                    if (n <= 0) return true;
                }
            } else if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) return true;
            }
        }
        return n <= 0;
    }
}
