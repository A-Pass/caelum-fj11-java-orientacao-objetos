public class FabricaDeCarro {
    private static FabricaDeCarro instancia = null;
    
    private FabricaDeCarro() {

    }   
    
    public static FabricaDeCarro  getInstancia() {
        if(instancia == null)
            FabricaDeCarro.instancia = new FabricaDeCarro();
        return FabricaDeCarro.instancia;
    }
}
