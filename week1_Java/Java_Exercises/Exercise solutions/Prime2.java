class Prime2 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        displayPrimes(i);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int p) {
        do {
            p++;
        } while (!isPrime(p));
        return p;
    }

    public static void displayPrimes(int n) {
        int primeNum = 0;
        for (int i=0; i<n; i++) {
            primeNum = nextPrime(primeNum);
            System.out.print(primeNum + " ");
        }
    }
}