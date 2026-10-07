class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap <>();
        for (int num : nums){
            // Used for each loop 
            if ( map.containsKey(num)){
                return true;
            }
            map.put(num, 1); // Storing the value, (num_value, Frequency)
        }
        return false;
    }
}