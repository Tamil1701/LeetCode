class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int maxLen = 0;
        
        while (right < nums.length) {
            if (nums[right] == 0) {
                k--;
            }
            
            while (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        
        return maxLen;
    }
}
