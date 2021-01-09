class Pessoa {
    String nome;
    int idade;
    
    public void fazAniversario() {
        this.idade++;
    }

    public String resgatarDadosParaImpressao()
    {
        String dados = "Nome: " + this.nome;
        dados += "\nIdade: " + this.idade;

        return dados;
    }
}
