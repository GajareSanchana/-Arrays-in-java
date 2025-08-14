public class RotateWithExtraArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int newPos = (i + k) % n;
            result[newPos] = nums[i];
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }

        // Print result
        for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
}

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
    }
}
