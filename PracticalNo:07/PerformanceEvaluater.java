class PerformanceEvaluater {

    static int factorial1(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f *= i;
        }
        return f;
    }

    static int factorial2(int n){
        if(n == 0 || n == 1)
            return 1;
        return n * factorial2(n - 1);
    }

    public static void main(String[] args){

        int nooftimes = 300000;

        // Iterative
        long st1 = System.currentTimeMillis();
        for(int i = 0; i < nooftimes; i++){
            factorial1(5);
        }
        long et1 = System.currentTimeMillis();

        // Recursive
        long st2 = System.currentTimeMillis();
        for(int i = 0; i < nooftimes; i++){
            factorial2(5);
        }
        long et2 = System.currentTimeMillis();

        long iterativeTime = et1 - st1;
        long recursiveTime = et2 - st2;

        System.out.println("Iterative total time (ms): " + iterativeTime);
        System.out.println("Recursive total time (ms): " + recursiveTime);

        System.out.println("Iterative avg (ms): " + (iterativeTime / (double)nooftimes));
        System.out.println("Recursive avg (ms): " + (recursiveTime / (double)nooftimes));
    }
}