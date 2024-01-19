import java.util.HashMap;

public class prodOfArray {
    public int[] productExceptSelf(int[] nums) {
        // create hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        // create result array
        int[] result = new int[nums.length];
        for (int i=0; i< nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            else {
               // System.out.println(nums[i]);
                hm.put(nums[i], 1);
            }
        }

        for (int i = 0; i< nums.length; i++) {
            int prod = 1;
            // remove 1 count nums[i] from hashmap
            hm.put(nums[i], hm.get(nums[i]) - 1);
            if (hm.containsKey(0)) {
                if (hm.get(0) > 0) {
                    result[i] = 0;
                    hm.put(nums[i], hm.get(nums[i]) + 1);
                    continue;
                }
            }
            for (int j = -30; j < 31; j++) {
                if (hm.containsKey(j)) {
                    prod = prod * (int)Math.pow(j, hm.get(j));
                }
            }
            
            hm.put(nums[i], hm.get(nums[i]) + 1);
            result[i] = prod;
        }

        return result;
        



}

