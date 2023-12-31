public class ReverseNumber {
    public static void main(String[] args) {
        //reverse(1234);
        //System.out.println(sum);
        System.out.println(reverse2(1234));
    }

    // Way : 1
    static int sum = 0;
    static void reverse(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    // Way : 2
    static int reverse2(int n){
        // sometimes we might need some additional variables in the argument in that case, make another function
        // rem = 10^arg-1 + fun(n/10, arg - 1)
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
