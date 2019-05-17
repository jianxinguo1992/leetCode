import java.util.HashMap;
import java.util.Map;

/**
 * @author JIANXIN.GUO
 * @date 2019-02-25 09:50
 **/
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            Integer index = map.get(a);
            if (index != null || a != nums[index]){
                return new int[]{i , index};
            }
        }
        return null;
    }
}
