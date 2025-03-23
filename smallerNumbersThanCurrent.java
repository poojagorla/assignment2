import java.util.Arrays;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; 
        int[] result = new int[nums.length];
        for (int num : nums) {
            count[num]++;
        }

        for (int i = 1; i < 101; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = (nums[i] == 0) ? 0 : count[nums[i] - 1];
        }

        return result;
    }
}