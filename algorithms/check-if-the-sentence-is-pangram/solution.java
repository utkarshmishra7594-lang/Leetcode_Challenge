class Solution {
    public boolean checkIfPangram(String sentence) {
        // Pangram means all 26 letters must appear at least once
        boolean[] seen = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }

        // Check if all 26 letters are seen
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}
