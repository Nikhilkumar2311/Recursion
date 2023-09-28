public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        //fun(n--);
        fun(--n);

        /*
        n-- vs --n
       n-- => this will pass the value of n first and then subtract it (it will
              always pass the value of n here 5 and make it infinite)
       --n => this will subtract first and then pass the value of n
        */
    }
}
