class C4_13FibonacciRecursivo {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i = 1; i <= 6; i++) {
            System.out.print(fibonacci.calculaFibonacci(i) + " ");
        }
        System.out.println();
    }
}