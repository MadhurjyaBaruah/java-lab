public class PrimeNumbers5 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 1000:");

        for (int number = 2; number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
