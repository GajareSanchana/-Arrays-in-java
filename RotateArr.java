//without extra array
public class RotateArr {

    // Function to reverse elements from index i to j
    public static void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    // Function to print array manually
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle if k > n

        System.out.print("Original array: ");
        printArray(nums);

        reverse(nums, 0, n - k - 1);
        System.out.print("After reversing first part [0 to " + (n - k - 1) + "]: ");
        printArray(nums);

        reverse(nums, n - k, n - 1);
        System.out.print("After reversing second part [" + (n - k) + " to " + (n - 1) + "]: ");
        printArray(nums);

        reverse(nums, 0, n - 1);
        System.out.print("After reversing the entire array: ");
        printArray(nums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);
    }
}
