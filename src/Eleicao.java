public class Eleicao {
    public static void main(String[] args) throws Exception {
        
        Candidato primeiroCandidato = new Candidato();
        primeiroCandidato.setNomeCandidato("Fulano");
        primeiroCandidato.setNumeroCandidato(82);
        primeiroCandidato.setPartidoCandidato("PAC");

        Candidato segundoCandidato = new Candidato();
        segundoCandidato.setNomeCandidato("Beltrano");
        segundoCandidato.setNumeroCandidato(28);
        segundoCandidato.setPartidoCandidato("PQ");

        Candidato terceiroCandidato = new Candidato();
        terceiroCandidato.setNomeCandidato("Siclano");
        terceiroCandidato.setNumeroCandidato(51);
        terceiroCandidato.setPartidoCandidato("PI");

        Eleitor primeiroEleitor = new Eleitor();
        primeiroEleitor.setNomeEleitor("Joao");
        // cria um static pra pergunta se eh um novo eleitor e caso seja criar um novo objeto eleitor para q ele vote(verificando o numero do titulo informado)

    }
}
