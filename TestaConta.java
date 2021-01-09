class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.titular = "Anderson Passos Silva";

        conta.numero = 98765431;

        conta.agencia = "1234-5";

        conta.dataAbertura = new Data();

        conta.dataAbertura.dia = 6;

        conta.dataAbertura.mes = 1;

        conta.dataAbertura.ano = 2021;

        conta.deposita(300);

        System.out.println(conta.recuperarDadosParaImpressao());
    }
}
