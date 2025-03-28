public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = { 64, 34, 25, 12, 22, 11, 90 };

        // Time complexity: O(n^2)
        // Space complexity: O(1)
        // Two nested loops are used to iterate through the array.
        // The outer loop runs n times, and the inner loop runs n-i-1 times, where i is
        // the current iteration of the outer loop.

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int num : nums) {
            System.out.print(num+" ");
        }
    }
}