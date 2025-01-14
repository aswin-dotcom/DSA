class Solution {
    public boolean isPalindrome(String s) {

        int first = 0;
        int last = s.length() - 1;
        while (first <= last) {
            char start = s.charAt(first);
            char end = s.charAt(last);
            if (!Character.isLetterOrDigit(start)) {
                first++;

            } else if (!Character.isLetterOrDigit(end)) {
                last--;
            } else {
                if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                    return false;
                }

                first++;
                last--;
            }
        }
        return true;

    }
}