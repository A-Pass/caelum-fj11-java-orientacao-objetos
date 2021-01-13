// Capítulo 4
class Conta {
    int numero;
    String agencia;
    //Cliente titular = new Cliente();
    String titular;
    double saldo;
    Data dataDeAbertura;

    boolean saca(double valor) {
        if(valor > this.saldo) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if(retirou == false) {
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

    double calculaRendimento() {
        return 0.0;
    }

    String recuperarDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
        dados += "\nAgência: " + this.agencia;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimentos: " + this.calculaRendimento();

        return dados;
    }
}
