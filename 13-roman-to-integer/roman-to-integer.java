class Solution {
    public int romanToInt(String s) {
        // Create a map for Roman numerals to their values
        java.util.Map<Character, Integer> romanMap = new java.util.HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        int prevValue = 0;
        
        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            
            // If current value is less than previous, subtract it (subtractive case)
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // Otherwise, add it
                result += currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return result;
    }
}