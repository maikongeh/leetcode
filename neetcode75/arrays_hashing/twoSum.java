import java.util.HashMap;

public class twoSum {
    
    public int[] twoSum(int[] nums, int target) {
        // create hashmap
        //create twoSum array
        int[] twoSum = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0; i< nums.length; i++) {
            int diff = target - nums[i];
            if (hm.containsKey(diff)) {
                twoSum[0] = i;
                twoSum[1] = hm.get(diff);
                return twoSum;
            } else {
                hm.put(nums[i], i);
            }
        }
        return twoSum;
    }
}
