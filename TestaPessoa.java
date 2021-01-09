class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Anderson Passos Silva";
        pessoa.idade = 23;

        System.out.println(pessoa.resgatarDadosParaImpressao());

        pessoa.fazAniversario();

        System.out.println(pessoa.resgatarDadosParaImpressao());

    }
    
}
