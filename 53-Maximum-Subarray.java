class Solution {
    public int maxSubArray(int[] nums) {

        int sumtill = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i< nums.length;i++){

            sumtill += nums[i];
            if (sumtill > maxi){
                maxi = sumtill;
            }

            if (sumtill < 0) {
                sumtill = 0;
            }
        }
        return maxi;

             
    }
}