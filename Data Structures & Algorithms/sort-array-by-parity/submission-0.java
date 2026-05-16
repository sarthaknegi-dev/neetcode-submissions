public class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if ((nums[i] & 1) == 1) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j--] = temp;
            } else {
                i++;
            }
        }
        return nums;
    }
}