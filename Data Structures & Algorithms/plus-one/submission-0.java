class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] newDigits = new int[n+1];
        newDigits[0] = 0;
        for(int i = 0; i < n; i++){
            newDigits[i+1] = digits[i];
        }

        int i = n;
        while(newDigits[i] > 8){
            newDigits[i] = 0;
            i--;
        }
        newDigits[i]++;

        if(newDigits[0] == 0){
            return Arrays.copyOfRange(newDigits, 1 , n+1);
        }else{
            return newDigits;
        }
    }
}
