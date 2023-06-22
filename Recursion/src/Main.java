public class Main {
    public static void main(String[] args) {
        Main recursion = new Main();
        int factorial = recursion.factorial(4);
        System.out.println(factorial);
    }
    public int factorial(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}