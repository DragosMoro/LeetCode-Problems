class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Indică unde ar trebui să plasăm următorul element non-zero.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // În cazul în care `i` este diferit de `nonZeroIndex`, înseamnă că am întâlnit
                // zerouri înainte,
                // și putem face un swap între elementul curent non-zero și primul zero
                // întâlnit.
                if (i != nonZeroIndex) {
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = 0;
                }
                // Avansăm `nonZeroIndex` pentru a indica următoarea poziție pentru un element
                // non-zero.
                nonZeroIndex++;
            }
        }
    }
}