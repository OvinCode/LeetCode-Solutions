class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        int [] arr = new int[n];

        for (int i = 0 ; i < n ; i ++ ){

            if (i + k < n ){
                arr[i+k] = nums[i]; 
            }

            else{
                arr[(i+k)%n] = nums[i];
            }
        }

        for (int j = 0 ; j < n ; j++){

            nums[j] = arr[j];

        }
        System.out.println(Arrays.toString(arr));
    }
}