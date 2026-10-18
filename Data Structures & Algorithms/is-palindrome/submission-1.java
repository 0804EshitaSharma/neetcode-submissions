
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric characters on the left
            if (!((l >= 'a' && l <= 'z') ||
                  (l >= '0' && l <= '9'))) {
                left++;
            }
            // Skip non-alphanumeric characters on the right
            else if (!((r >= 'a' && r <= 'z') ||
                       (r >= '0' && r <= '9'))) {
                right--;
            }
            // Compare valid characters
            else {
                if (l != r) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
