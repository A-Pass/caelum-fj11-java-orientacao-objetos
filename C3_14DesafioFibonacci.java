class C3_14DesafioFibonacci {
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        
        System.out.print("" + n0 + " " );
        System.out.print("" + n1 + " " );

        while(n1 < 100) {
            System.out.print(n1 + n0 + " ");
            n1 += n0;
            n0 = n1 - n0;
        }
    }
}