class Data {
    private int dia = 1;
    private int mes = 1;
    private int ano = 0;

    public Data(int dia, int mes, int ano) {
        if (dia > 0) {
            if(mes == 2 && dia < 29) {
                this.dia = dia;
            } 
            else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31) {
                this.dia = dia;
            }
            else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia < 32) {
                this.dia = dia;
            }
        }

        if (0 < mes && mes < 13) {
            this.mes = mes;
        }

        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public String formatada() {
        return "" + this.dia + '/' + this.mes + '/' + this.ano;
    }
}
