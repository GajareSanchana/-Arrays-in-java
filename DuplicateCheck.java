public class DuplicateCheck {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        
        // Compare each element with every other element
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 2};
        System.out.println(containsDuplicate(nums1)); // Output: true

        int[] nums2 = {1, 2, 3, 4, 5, 6};
        System.out.println(containsDuplicate(nums2)); // Output: false
    }
}
