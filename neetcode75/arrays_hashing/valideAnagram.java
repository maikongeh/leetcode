public class valideAnagram {
    
    public boolean isAnagram(String s, String t){
        // create hashmap
        HashMap<Character, Integer> hm = new HashMap<>();
        // iterate through string s
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }
            else {
                hm.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (hm.containsKey(t.charAt(i))) {
                int num = hm.get(t.charAt(i));
                if (num == 0) {
                    return false;
                }
                hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
            }
            else {
                return false;
            }
        }

        return true;
    }
}
