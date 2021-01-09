class TestaCasa {
    public static void main(String[] args) {
        Casa casa = new Casa();

        casa.porta1 = new Porta();
        casa.porta1.abre();


        casa.porta2 = new Porta();
        casa.porta3 = new Porta();
        casa.porta3.abre();

        casa.pintar("Vermelha");
        System.out.println(casa.resgatarDadosParaImpressao());
    }
}
