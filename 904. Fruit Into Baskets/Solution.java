// Sliding Window Problem Variable Size Problem
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
           int i = 0;
        int j = 0;
        int max = 0;
        int len = fruits.length;

        while (j < len) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            
            // If there are more than 2 types of fruits in the basket, move the left pointer until there are only 2 types
            while (map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }
                i++;
            }
            
            max = Math.max(max, j - i + 1);
            j++;
        }
        
        return max;
    }
}
