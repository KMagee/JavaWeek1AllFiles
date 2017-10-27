class Prime1 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if(isPrime(i)) {
            System.out.println(i + " is prime");
        } else {
            System.out.println(i + " is not prime");
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}