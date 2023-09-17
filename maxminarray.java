public class maxminarray {
    public static void findMaxMin(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        System.out.println("Minimum of the array is: " + min);
        System.out.println("Maximum of the array is: " + max);
    }

    public static void main(String[] args) {
        int[] num = {4, 6, 8, 8, 34, 56};
        findMaxMin(num);
    }
}