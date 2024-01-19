public class longestConsecSeq {

    public int longestConsecutive(int[] nums) {
        // create hmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        int longest = 0;

        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int numUp = nums[i];
            int numDown = nums[i];
            if (visited.containsKey(nums[i])) {
                continue;
            }
            visited.put(nums[i], 1);
            while(hm.containsKey(numUp + 1)) {
                count++;
                numUp++;
                visited.put(numUp, 1);
            }
            while(hm.containsKey(numDown - 1)) {
                count++;
                numDown--;
                visited.put(numDown, 1);
            }
            if (count > longest) {
                longest = count;
            }
        }
        return longest;
    }
    
}