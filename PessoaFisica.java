class PessoaFisica {
    private String cpf;
    
    PessoaFisica(String cpf) {
        if(this.validaCpf(cpf)) {
            this.cpf = cpf;
        }
    }

    private validaCpf(String cpf) {
        // Algoritimo de validação de CPF
    }
}
