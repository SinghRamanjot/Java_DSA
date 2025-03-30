public class InsertionSort {

    public static void main(String a[]) {
        int[] nums = { 4, 3, 2, 1 };
        int j;
        int key;

        for (int i = 0; i < nums.length; i++) {
            key = nums[i];
            j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}