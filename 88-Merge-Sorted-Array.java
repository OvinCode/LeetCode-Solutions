class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n + m];
        int i = 0 , j = 0;
        int k = 0;

       while (i < m && j < n && k < m + n) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }

// If there are remaining elements in nums1
        while (i < m && k < m + n) {
            res[k] = nums1[i];
            i++;
            k++;
        }

// If there are remaining elements in nums2
        while (j < n && k < m + n) {
            res[k] = nums2[j];
            j++;
            k++;
        }

       
        for (int z = 0 ; z < n + m ; z ++ ){

            nums1[z] = res[z];
        }

        
    }
}