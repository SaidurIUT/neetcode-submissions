class Solution {
    public void sortColors(int[] nums) {
        int r = 0, w = 0, b = 0;

        // Count 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) {
                r++;
            } else if (num == 1) {
                w++;
            } else {
                b++;
            }
        }

        // Fill 0s
        int i = 0;
        while (i < r) {
            nums[i++] = 0;
        }

        // Fill 1s
        while (i < r + w) {
            nums[i++] = 1;
        }

        // Fill 2s
        while (i < r + w + b) {
            nums[i++] = 2;
        }
    }
}
