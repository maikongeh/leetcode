package two_pointer;

public class twoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            // can use binary seach as well since sorted array
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] == diff) {
                    return new int[] {i+1, j+1};
                }
            }
        }
        return null;
    }
}
