package br.com.caelum.contas.modelo;


class Conta {
    private static int qtd = 0;

    private int identificador;

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    public Conta() {
        this.identificador = ++Conta.qtd;
    }

    public Conta(String titular) {
        this();
        this.titular = titular;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        
        return this.saldo * 0.019;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public String recuperarDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nData de abertura: " + this.dataAbertura.formatada();
        dados += "\nAgência: " + this.agencia;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.getSaldo();
        dados += "\nRendimentos: " + this.calculaRendimento();

        return dados;
    }
}
