class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.titular = "Anderson Passos Silva";

        conta.numero = 98765431;

        conta.agencia = "1234-5";

        conta.dataDeAbertura = new Data();

        conta.dataDeAbertura.dia = 6;

        conta.dataDeAbertura.mes = 1;

        conta.dataDeAbertura.ano = 2021;

        conta.deposita(300);

        System.out.println(conta.recuperarDadosParaImpressao());
    }
}
