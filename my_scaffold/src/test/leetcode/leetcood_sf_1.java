import java.util.Arrays;

/**
 * @Author YangZhenYuan
 * @Date 2020/3/22 12:28
 * @Version 1.0
 * @Describe
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class leetcood_sf_1 {

    public static int[]  twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i = 0; i < nums.length ; i++) {
//            if(target-nums[i]>=0){
                for (int j = i+1; j < nums.length; j++) {
                    if(target-nums[i] == nums[j]){
                        result[0]=i;
                        result[1]=j;
                        return result;
                    }
                }
//            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,-3,-4,-5};
        int[] result =twoSum(nums,-8);
        System.out.println(Arrays.toString(result));
    }

}
