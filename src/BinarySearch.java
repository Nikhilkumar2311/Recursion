// Binary Search using Recursion
/*
1.> Comparing O(1)
2.> Dividing into 2 parts
3.> Recurrence Relation : F(N) = O(1) + F(N/2)
    O(1) -> Comparison
    F(N/2) -> Dividing in half
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {34,45,67,89,90};
        int target = 89;
        System.out.println(binary(arr, target, 0, arr.length-1));
    }

    static int binary(int[] arr, int target, int s, int e){

        if(s > e){
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target){
            return m;
        }

        if (target < arr[m]){
            return binary(arr, target, s, m-1);
        }

        return binary(arr, target, m+1, e);
    }

}

/*
Types of Recurrence Relation
1.> Linear Recurrence Relation -> eg: Fibonacci Number
2.> Divide & Conquer Recurrence Relation -> eg: Binary Search
            (Reduced by a factor, Here by N/2)
 */

//Tip: Don't Overthink
