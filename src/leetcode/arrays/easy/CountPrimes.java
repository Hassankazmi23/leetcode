package leetcode.arrays.easy;

public class CountPrimes {
    public int countPrimes(int n) {
        int countPrimes = 0;
        boolean[] primes = new boolean[n];

        for(int i = 2; i * i < primes.length; i++) {
            if(!primes[i]) {
                for(int j = i; j * i < primes.length; j++) {
                    primes[i * j] = true;
                }
            }
        }

        for(int i = 2; i < primes.length; i++) {
            if(!primes[i]) {
                countPrimes++;
            }
        }

        return countPrimes;

    }
}
