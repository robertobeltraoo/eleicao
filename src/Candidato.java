public class Candidato{

    private String nomeCandidato;
    private int numeroCandidato;
    private int votosCandidato = 0;
    private String partidoCandidato;
    
    public String getNomeCandidato() {
        return nomeCandidato;
    }
    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }
    
    public String getPartidoCandidato() {
        return partidoCandidato;
    }
    public void setPartidoCandidato(String partidoCandidato) {
        this.partidoCandidato = partidoCandidato;
    }
    
    public int getVotosCandidato() {
        return votosCandidato;
    }
    public void setVotosCandidato(int votosCandidato) {
        this.votosCandidato = votosCandidato;
    }
    
    public int getNumeroCandidato() {
        return numeroCandidato;
    }
    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }
    

}