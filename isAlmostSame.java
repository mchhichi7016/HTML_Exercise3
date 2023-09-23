import java.util.HashMap;
import java.util.Map;

public class isAlmostSame {
    public static boolean isAlmostSame(String word1, String word2) {
        // 如果字符串长度不同，直接返回 false
        if (word1.length() != word2.length()) {
            return false;
        }

        // 统计两个字符串中每个字母的出现频率
        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
        }

        // 检查两个字符串的字母频率差是否都不超过3
        for (char c = 'a'; c <= 'z'; c++) {
            int count1 = freqMap1.getOrDefault(c, 0);
            int count2 = freqMap2.getOrDefault(c, 0);

            if (Math.abs(count1 - count2) > 3) {
                return false;
            }
        }

        return true;
    }
}


