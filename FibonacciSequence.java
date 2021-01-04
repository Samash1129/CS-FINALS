public class FibonacciSequence {
    public static int Fibonacci(int N){
        if(N == 0){
            return 0; }
        if( N == 1 || N == 2 ){
            return 1;
        }
        return Fibonacci(N-2) + Fibonacci(N-1);


    }
    public static void main(String[] args){
        int N = 6;
        System.out.print("the fibonacci sequence for " + N + " is" + " = "  );
        for(int i = 0; i <= N + 1; i++)
            System.out.print(Fibonacci(i) + " ");
    }
}
