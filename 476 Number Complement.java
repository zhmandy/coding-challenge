class Solution {
    public int findComplement(int num) {
        int n = (int)(Math.log(num) / Math.log(2)) + 1;
        int bitmask = (1 << n) - 1;
        return bitmask ^ num;
    }
}