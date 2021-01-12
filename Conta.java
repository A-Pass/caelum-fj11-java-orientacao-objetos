// Capítulo 4
class Conta {
    int numero;
    String titular;
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
}
