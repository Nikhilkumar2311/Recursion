// How to solve a question using Recursion
// 1.> Break it down into smaller problems
// 2.> The base condition is represented by the answers we already have
// (In this condition we Know that f(0) = 0 & f(1) = 1, This is Base Condition)
// for Fibonacci recurrence relation is fibo(N) = fibo(N-1) + fibo(N-2)

public class Fibonacci_number {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

// Dynamic Programming : Repetition of Function call is not there, Here F(2) is repeated

/*
recursive tree for fibonacci number
                      f(4)
             f(3)               f(2)
       f(2)       f(1)     f(1)      f(0)
  f(1)      f(0)
put arrows here
 */

/*
Note: How to Understand & approach a problem
1.> Identify if we can break down problem into smaller problems
2.> Write the recurrence relation id needed
3.> Draw the recursive tree
4.> About the tree:
    -> See the flow of functions, how they are getting in stack
    -> Identify & flows on left and right tree calls
    -> Draw the tree and pointer again & again using pen and paper
    -> Use the debugger to see the flow
5.> See how the values & what type of values (int, String etc..) are returned at each step
    See where the function call will come out, and in the end you will come out of main function
 */

/*
Very IMP
VARIABLES:
1.> Arguments(Function Name(Arguments))
2.> Return Type
3.> Body of function
 */