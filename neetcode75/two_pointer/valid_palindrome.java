package two_pointer;

public class valid_palindrome {
    public boolean isPalindrome(String s) {
        // remove all non-alphabet characters
        // make all characters lowercase

        String removed = s.replaceAll("[^a-zA-Z0-9]", "");
        removed = removed.toLowerCase();
        for (int i = 0; i < removed.length()/2; i++) {
            if (removed.charAt(i) != removed.charAt(removed.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    
}
