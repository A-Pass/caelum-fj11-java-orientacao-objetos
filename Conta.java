// Capítulo 4
class Conta {
    private static int totalDeContas = 0;

    private int identificador;

    private int numero;
    private String agencia;
    //Cliente titular = new Cliente();
    private String titular;
    private double saldo;
    private Data dataDeAbertura;

    public Conta() {
        this.identificador = ++totalDeContas;
    }

    public Conta(String titular) {
        Conta();
        this.setTitular(titular);
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.titular;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Data getDataDeAbertura() {
        return this.dataDeAbertura;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public boolean saca(double valor) {
        if(valor > this.saldo) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    public boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if(retirou == false) {
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

    public double getRendimento() {
        return 0.0;
    }

    public String recuperarDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
        dados += "\nAgência: " + this.agencia;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimentos: " + this.calculaRendimento();

        return dados;
    }
}
