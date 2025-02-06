class Solution {
    private static final int MOD = 1337;

    // Modular exponentiation: (a^b) % mod
    public int modPow(int a, int b) {
        a %= MOD; // Reduce a mod 1337
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }

    public int superPow(int a, int[] b) {
        int result = 1;
        for (int num : b) {
            result = modPow(result, 10) * modPow(a, num) % MOD;
        }
        return result;
    }
}