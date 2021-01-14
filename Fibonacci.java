class Fibonacci {
    int calculaFibonacci(int n) {
        return n > 1 ? calculaFibonacci(n-2) + calculaFibonacci(n-1) : n; 
    }    
}
