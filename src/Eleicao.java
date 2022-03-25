import javax.swing.JOptionPane;

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
        primeiroEleitor.setNumTitulo(1);

        Eleitor segundoEleitor = new Eleitor();
        segundoEleitor.setNomeEleitor("Ricardo");
        segundoEleitor.setNumTitulo(2);

        Eleitor terceiroEleitor = new Eleitor();
        terceiroEleitor.setNomeEleitor("Maria");
        terceiroEleitor.setNumTitulo(3);

        Eleitor quartoEleitor = new Eleitor();
        quartoEleitor.setNomeEleitor("Alice");
        quartoEleitor.setNumTitulo(4);

        Eleitor quintoEleitor = new Eleitor();
        quintoEleitor.setNomeEleitor("Manoela");
        quintoEleitor.setNumTitulo(5);

        //isso pode virar uma funcao e chamar a msm funcao no primeiro e segundo turno
        boolean votacao = false;
        while(votacao != true){
            //JOptionPane.showInputDialog(null, "Digite seu nome Eleitor\n"+primeiroEleitor.getNomeEleitor()+"\n"+segundoEleitor.getNomeEleitor()+"\n"+terceiroEleitor.getNomeEleitor()+"\n"+quartoEleitor.getNomeEleitor()+"\n"+quintoEleitor.getNomeEleitor());
            String titulo = JOptionPane.showInputDialog(null, "Digite o numero do titulo correspondente:\n"+primeiroEleitor.getNomeEleitor()+" = "+primeiroEleitor.getNumTitulo()+"\n"+segundoEleitor.getNomeEleitor()+" = "+segundoEleitor.getNumTitulo()+"\n"+terceiroEleitor.getNomeEleitor()+" = "+terceiroEleitor.getNumTitulo()+"\n"+quartoEleitor.getNomeEleitor()+" = "+quartoEleitor.getNumTitulo()+"\n"+quintoEleitor.getNomeEleitor()+" = "+quintoEleitor.getNumTitulo());
            int nTitulo = parseInt(titulo);
            if((nTitulo == 1) && (primeiroEleitor.isStatusVoto() == false)){
                primeiroEleitor.setStatusVoto(true);
                String vt = JOptionPane.showInputDialog("Digite o numero do candidato que ira votar:\n"+primeiroCandidato.getNomeCandidato()+" = "+primeiroCandidato.getNumeroCandidato()+"\n"+segundoCandidato.getNomeCandidato()+" = "+segundoCandidato.getNumeroCandidato()+"\n"+terceiroCandidato.getNomeCandidato()+" = "+terceiroCandidato.getNumeroCandidato());
                int voto = parseInt(vt);
                if(voto == 82){
                    primeiroCandidato.setVotosCandidato(+1);
                }else if(voto == 28){
                    segundoCandidato.setVotosCandidato(+1);  
                }else if(voto == 51){
                    terceiroCandidato.setVotosCandidato(+1);
                }
            }else if((nTitulo == 1) && (primeiroEleitor.isStatusVoto() != false)){
                JOptionPane.showMessageDialog(null, "Esse eleitor ja votou.");
            }
            
            if((nTitulo == 2) && (segundoEleitor.isStatusVoto() == false)){
                segundoEleitor.setStatusVoto(true);
                String vt = JOptionPane.showInputDialog("Digite o numero do candidato que ira votar:\n"+primeiroCandidato.getNomeCandidato()+" = "+primeiroCandidato.getNumeroCandidato()+"\n"+segundoCandidato.getNomeCandidato()+" = "+segundoCandidato.getNumeroCandidato()+"\n"+terceiroCandidato.getNomeCandidato()+" = "+terceiroCandidato.getNumeroCandidato());
                int voto = parseInt(vt);
                if(voto == 82){
                    primeiroCandidato.setVotosCandidato(+1);
                }else if(voto == 28){
                    segundoCandidato.setVotosCandidato(+1);  
                }else if(voto == 51){
                    terceiroCandidato.setVotosCandidato(+1);
                }
            }else if((nTitulo == 2) && (segundoEleitor.isStatusVoto() == true)){
                JOptionPane.showMessageDialog(null, "Esse eleitor ja votou.");
            }
            
            if((nTitulo == 3) && (terceiroEleitor.isStatusVoto() == false)){
                terceiroEleitor.setStatusVoto(true);
                String vt = JOptionPane.showInputDialog("Digite o numero do candidato que ira votar:\n"+primeiroCandidato.getNomeCandidato()+" = "+primeiroCandidato.getNumeroCandidato()+"\n"+segundoCandidato.getNomeCandidato()+" = "+segundoCandidato.getNumeroCandidato()+"\n"+terceiroCandidato.getNomeCandidato()+" = "+terceiroCandidato.getNumeroCandidato());
                int voto = parseInt(vt);
                if(voto == 82){
                    primeiroCandidato.setVotosCandidato(+1);
                }else if(voto == 28){
                    segundoCandidato.setVotosCandidato(+1);  
                }else if(voto == 51){
                    terceiroCandidato.setVotosCandidato(+1);
                }
            }else if((nTitulo == 3) && (terceiroEleitor.isStatusVoto() == true)){
                JOptionPane.showMessageDialog(null, "Esse eleitor ja votou");
            }
            
            if((nTitulo == 4) && (quartoEleitor.isStatusVoto() == false)){
                quartoEleitor.setStatusVoto(true);
                String vt = JOptionPane.showInputDialog("Digite o numero do candidato que ira votar:\n"+primeiroCandidato.getNomeCandidato()+" = "+primeiroCandidato.getNumeroCandidato()+"\n"+segundoCandidato.getNomeCandidato()+" = "+segundoCandidato.getNumeroCandidato()+"\n"+terceiroCandidato.getNomeCandidato()+" = "+terceiroCandidato.getNumeroCandidato());
                int voto = parseInt(vt);
                if(voto == 82){
                    primeiroCandidato.setVotosCandidato(+1);
                }else if(voto == 28){
                    segundoCandidato.setVotosCandidato(+1);  
                }else if(voto == 51){
                    terceiroCandidato.setVotosCandidato(+1);
                }
            }else if((nTitulo == 4) && (quartoEleitor.isStatusVoto() == true)){
                JOptionPane.showMessageDialog(null, "Esse eleitor ja votou");
            }

            if((nTitulo == 5) && (quintoEleitor.isStatusVoto() == false)){
                quintoEleitor.setStatusVoto(true);
                String vt = JOptionPane.showInputDialog("Digite o numero do candidato que ira votar:\n"+primeiroCandidato.getNomeCandidato()+" = "+primeiroCandidato.getNumeroCandidato()+"\n"+segundoCandidato.getNomeCandidato()+" = "+segundoCandidato.getNumeroCandidato()+"\n"+terceiroCandidato.getNomeCandidato()+" = "+terceiroCandidato.getNumeroCandidato());
                int voto = parseInt(vt);
                if(voto == 82){
                    primeiroCandidato.setVotosCandidato(+1);
                }else if(voto == 28){
                    segundoCandidato.setVotosCandidato(+1);  
                }else if(voto == 51){
                    terceiroCandidato.setVotosCandidato(+1);
                }
            }else if((nTitulo == 5) && (quintoEleitor.isStatusVoto() == true)){
                JOptionPane.showMessageDialog(null, "Esse eleitor ja votou");
            }

            String encerrar = JOptionPane.showInputDialog("Encerrar programa turno? [s/n]");
            if(encerrar.equalsIgnoreCase("s")){
                votacao = true;
            }
        }


        // cria um static pra pergunta se eh um novo eleitor e caso seja criar um novo objeto eleitor para q ele vote(verificando o numero do titulo informado)

    }

    private static int parseInt(String titulo) {
        return 0;
    }
}
