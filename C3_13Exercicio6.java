class C3_13Exercicio6 {
    public static void main(String[] args) {
        int n0 = 0;
        int n1 = 1;
        int n1_;
        
        System.out.print("" + n0 + " " );
        System.out.print("" + n1 + " " );

        while(n1 < 100) {
            n1_ = n1;
            n1 = n0 + n1;
            n0 = n1_;
            System.out.print("" + n1 + " " );
        }
    }

}