package leet_code_problems;
public class demo {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int no[] = {4, 3, 2, 1};
        int[] result = obj.twoSum(no, 3);

        if (result.length > 0) {
            System.out.println("Match found: " + result[0] + " + " + result[1] + " = 3");
        } else {
            System.out.println("No match found");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (i == j) {
                    continue; // Don't use the same element twice
                }
                if (nums[j] + nums[i] == target) {
                    int res[] = {nums[j], nums[i]};
                    return res;
                }
            }
        }
        return new int[0]; // Return empty array if no match
    }
}
