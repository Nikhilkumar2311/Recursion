/*
 Given an integer num, return the number of Steps to reduce it to Zero
 In one step, if the current number is even, you have to divide it by 2, otherwise,
 you have to subtract 1 from it
 */
public class Steps {
    public static void main(String[] args) {
        Steps s1 = new Steps();
        System.out.println(s1.numberofSteps(12));
    }

    public int numberofSteps(int num){
        return helper(num, 0);
    }

    private int helper(int num, int steps) {
        if (num == 0){
            return steps;
        }

        // for even
        if (num % 2 == 0){
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
