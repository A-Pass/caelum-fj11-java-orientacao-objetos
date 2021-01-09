class TestaPorta {
    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.dimensaoX = 0.80f;
        porta.dimensaoY = 1.80f;
        porta.dimensaoZ = 0.02f;

        System.out.println("Estado: " + porta.estaAberta());

        porta.abre();

        System.out.println("Estado: " + porta.estaAberta());


        porta.fecha();

        System.out.println("Estado: " + porta.estaAberta());
    }
}
