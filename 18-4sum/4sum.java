class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target1) {
        List<List<Integer>> ans  = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        long target = (long) target1; 
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) { 

                int p1 = j+1;
                int p2 = n-1;
                while(p1 < p2) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[p1] +  nums[p2]; 
                    if(sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j],nums[p1],nums[p2] ));
                        while((p1+1 < p2) && (nums[p1] ==nums[p1+1]))
                          p1++;
                        while(p2-1 >p1 && nums[p2] == nums[p2-1])
                          p2--;

                        p1++;
                        p2--;
                    }
                    else if(sum <target)
                        p1++;
                
                    else
                        p2--;
    
                }
                while((j+1 < n) && (nums[j] ==nums[j+1]))
                    j++;

            }
            while((i+1 < n) && (nums[i] ==nums[i+1]))
                i++;

        }

        return ans;  
    }
}