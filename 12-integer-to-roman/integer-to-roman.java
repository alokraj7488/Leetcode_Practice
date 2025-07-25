class Solution {
    public String intToRoman(int num) {
        // Arrays for values and corresponding Roman numerals
        // Including subtractive cases (4, 9, 40, 90, 400, 900)
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder result = new StringBuilder();
        
        // Process each value from largest to smallest
        for (int i = 0; i < values.length; i++) {
            // Add the numeral as many times as the value fits into num
            while (num >= values[i]) {
                result.append(numerals[i]);
                num -= values[i];
            }
        }
        
        return result.toString();
    }
}