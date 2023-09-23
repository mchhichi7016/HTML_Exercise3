
public class Main {
    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};

        int result1 = s1.singleNumber(nums1);
        int result2 = s1.singleNumber(nums2);

        System.out.println(result1);
        System.out.println(result2);

    }
}
