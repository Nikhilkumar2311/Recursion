public class Basic {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        // Base condition
        if(n == 5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        // Recursive Call
        // if we are calling a function again and again, you can treat it as a separate call in the stack
        // Function call stores in Stack
        // Every function call take separate memory

        // This is tail recursion as this is last function call
        print(n + 1);
    }
}

// Why Recursion?
// It helps us in Solving Bigger/ Complex problems in Simpler way
// We can convert Recursion Solution into iteration(Loops) & Vice Verse
// Space Complexity is not Constant because of recursive calls