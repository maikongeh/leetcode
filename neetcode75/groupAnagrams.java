import java.util.List;

public class groupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        List<HashMap<Character, Integer>> listOfMap = new ArrayList<>();
        for (int i =0; i<strs.length; i ++) {
            // create own hashmap
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                if (hm.containsKey(strs[i].charAt(j))) {
                    hm.put(strs[i].charAt(j), hm.get(strs[i].charAt(j)) + 1);
                }
                else {
                    hm.put(strs[i].charAt(j), 1);
                }
            }
            if (listOfMap.contains(hm)) {
                int index = listOfMap.indexOf(hm);
                result.get(index).add(strs[i]);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                result.add(list);
                listOfMap.add(hm);
            }
        }
        return result;
    }    
}
