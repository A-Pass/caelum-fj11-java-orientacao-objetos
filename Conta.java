// Capítulo 4
class Conta {
    int numero;
    Conta titular = new Cliente();
    double saldo;

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
}
