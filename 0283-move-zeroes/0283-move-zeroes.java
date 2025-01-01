class Solution {
    public void moveZeroes(int[] nums) {
        int element = 0;
        int traverser = 0;
        while(traverser < nums.length){
            
            if(nums[traverser] != 0){
                int temp = nums[element];
                nums[element] = nums[traverser];
                nums[traverser] = temp;
                element++;
            }
            
            traverser++;
        }
        
    }
}