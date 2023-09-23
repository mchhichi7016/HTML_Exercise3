import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // 遍历数组，将元素及其出现次数存入哈希表
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // 再次遍历数组，查找出现次数为1的元素
        for (int num : nums) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        // 如果未找到，返回0或其他适当的值，具体情况可根据需求调整
        return 0;
    }
}
