public class Prob17 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 16;
        int result = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is " + result);
    }
}
