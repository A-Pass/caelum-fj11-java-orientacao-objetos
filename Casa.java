class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    void pintar(String cor) {
        this.cor = cor;
    }

    int quantasPortasEstaoAberta() {
        return (this.porta1.estaAberta()?1:0) + (this.porta2.estaAberta()?1:0) + (this.porta3.estaAberta()?1:0);
    }

    String resgatarDadosParaImpressao() {
        String dados = "Cor: " + this.cor;
        dados += "\nPortas abertas: " + this.quantasPortasEstaoAberta();
        return dados;
    }
}
