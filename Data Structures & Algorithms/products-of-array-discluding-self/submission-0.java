class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int mul = 1;
        int zeroCount=0;
        int[] res = new int[n];

        for(int i : nums){
            if(i!=0){
                mul = mul * i;
            }else{
                zeroCount++;
            }
        }

        if(zeroCount > 1){
            return new int[n];
        }
        

        for(int i =0; i<n ; i++){
            if(zeroCount > 0){
                res[i] = (nums[i] == 0) ? mul : 0;
            } else{
                res[i] = mul/nums[i];
            }
        }

        return res;

    }
}  
