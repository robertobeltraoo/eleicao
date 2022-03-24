public class Eleitor {
    
    private String nomeEleitor;
    private int NumTitulo;
    private boolean statusVoto = false;
    
    public String getNomeEleitor() {
        return nomeEleitor;
    }
    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }
    
    public boolean isStatusVoto() {
        return statusVoto;
    }
    public void setStatusVoto(boolean statusVoto) {
        this.statusVoto = statusVoto;
    }
    
    public int getNumTitulo() {
        return NumTitulo;
    }
    public void setNumTitulo(int numTitulo) {
        this.NumTitulo = numTitulo;
    }
    
}
