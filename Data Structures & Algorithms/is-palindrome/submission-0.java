class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int length = s.length();
        int middle = length/2;
        for(int i=0; i < middle ; i++){
            if(s.charAt(i) != s.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
