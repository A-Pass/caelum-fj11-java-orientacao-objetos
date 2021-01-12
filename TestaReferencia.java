class TestaReferencia {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Duke";
        c1.deposita(100);

        //Conta c2 = c1; // linha importante
        Conta c2 = new Conta();
        c2.titular = "Duke";
        c2.deposita(200);

        //System.out.println(c1.saldo);
        //System.out.println(c2.saldo);

        if (c1 == c2) {
            System.out.println("Contas iguais");
        }
    }   
}
