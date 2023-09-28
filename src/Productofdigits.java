public class Productofdigits {
    public static void main(String[] args) {
        int ans = productofdigits(1234);
        System.out.println(ans);
    }

    static int productofdigits(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10) * productofdigits(n/10);
    }
}
