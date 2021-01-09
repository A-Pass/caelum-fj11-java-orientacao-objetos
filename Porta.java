class Porta {
    boolean aberta;
    String cor;
    float dimensaoY;
    float dimensaoX;
    float dimensaoZ;
    
    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    } 

    public boolean estaAberta() {
        return this.aberta;
    }
}