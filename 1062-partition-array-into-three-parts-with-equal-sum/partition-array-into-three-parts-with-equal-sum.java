class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
    int total = 0;
        for (int x : arr) total += x;

        if (total % 3 != 0) return false;

        int target = total / 3;
        int prefix = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            prefix += arr[i];
            if (prefix == target) {
                count++;
                prefix = 0;
            }
            if (count == 2) return true;
        }

        return false;
    }
}