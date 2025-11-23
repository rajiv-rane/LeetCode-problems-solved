class Solution {
    public boolean isValid(String s) {

        // Keep looping while the string still contains any valid pair
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {

            // Remove all valid bracket pairs
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        // If there’s nothing left, it's valid
        return s.length()==0;
    }
}
