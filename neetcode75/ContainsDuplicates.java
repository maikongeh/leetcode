import java.util.HashMap;
// create ContainsDuplicates class
class ContainsDuplicates {
    public boolean ContainsDuplicates(int[] nums) {
        // create hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i< nums.length; i++i) {
            if (hm.containsKey(nums[i])) {
                return true;
            }
            else {
                hm.put(nums[i], 1);
            }
        }
        return false;
    }
}