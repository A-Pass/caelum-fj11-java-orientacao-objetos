class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        for (int i = 1; i <= 6; i++) {
            int resultado = fibonacci.calculaFibonacci(i);
            System.out.println(resultado);
        }
    }

    public int calculaFibonacci(int n) {
        
        return n > 2 ? this.calculaFibonacci(n-1) + this.calculaFibonacci(n-2) : 1;
    }
}