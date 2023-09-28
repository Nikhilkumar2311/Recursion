// input : 1234   output : 1 + 2 + 3 + 4  = 10
public class Sumofdigits {
    public static void main(String[] args) {
        int ans = sumofdigits(1234);
        System.out.println(ans);
    }

    static int sumofdigits(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + sumofdigits(n/10);
    }
}
