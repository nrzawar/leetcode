class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
            if(map.get(num) > nums.length/3 && !ans.contains(num)){
                ans.add(num);
            }
        }
        return ans;   
    }
}