public class PrimeCounter {
    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
        System.out.println(primeCount(11, 29));
        System.out.println(primeCount(20, 22));
        System.out.println(primeCount(1, 1));
        System.out.println(primeCount(5, 5));
        System.out.println(primeCount(6, 2));
        System.out.println(primeCount(-10, 6));
    }

//    Write a function named primeCount with signature
//    int primeCount(int start, int end);
//    The function returns the number of primes between start and end inclusive. Recall that a prime is
//    a positive integer greater than 1 whose only integer factors are 1 and itself.

    static int primeCount(int start, int end) {
        if (end < 1 || start > end) {
            return -1;
        }
        if (start < 1) {
            start = 2;
        }
        int cnt = 0;
        for (int i = start; i <= end; i++) {
            cnt += checkPrime(i);
        }
        return cnt;
    }

    static int checkPrime(int num) {
        if (num < 2) {
            return 0;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }
}
