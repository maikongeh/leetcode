package two_pointer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        //create hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // increment hashmap
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            else {
                hm.put(nums[i], 1);
            }
        }
        HashMap<List<Integer>, Integer>> hm2 = new HashMap<>();
        // create all distinct pairs of numbers
        for (int i = 0; i < nums.length; i++) {
            // remove 1 count nums[i] from hashmap
            for (int j = i + 1; j < nums.length; j++) {
                // remove 1 count nums[j] from hashmap
                hm.put(nums[i], hm.get(nums[i]) - 1);
                hm.put(nums[j], hm.get(nums[j]) - 1);
                int sum = nums[i] + nums[j];
                int diff = -sum;
                if (hm.containsKey(diff)) {
                    if (hm.get(diff) > 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(diff);
                        List<Integer> list2 = new ArrayList<>(list);
                        Collections.sort(list2);
                        if (hm2.containsKey(list2)) {
                            hm.put(nums[j], hm.get(nums[j]) + 1);
                            hm.put(nums[i], hm.get(nums[i]) + 1);
                            continue;
                        } else {
                            hm2.put(list2, 1);
                        }
                        result.add(list);
                    }
                }
                // add 1 count nums[j] from hashmap
                hm.put(nums[j], hm.get(nums[j]) + 1);
            }
            // add 1 count nums[i] from hashmap
            hm.put(nums[i], hm.get(nums[i]) + 1);
        }
        return result;
    }    
}
