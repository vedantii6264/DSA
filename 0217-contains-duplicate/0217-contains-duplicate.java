import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       // Optimal Solution using HashSet
      HashSet<Integer> set = new HashSet<>();
      for (int num : nums) {
          if (set.contains(num)) {
              return true;
          }
          set.add(num);
      }
      return false;
    }
}
