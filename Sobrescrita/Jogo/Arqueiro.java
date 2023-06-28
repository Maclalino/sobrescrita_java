package Sobrescrita.Jogo;

public final class Arqueiro extends Personagem {
private String arma;
    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma= "Arco Flecha";
    }
    @Override
    public String toString() {
        String conteudoPersonagem=super.toString();
        String conteudoArqueiro=String.format("-Arma: %s", arma);
        return conteudoPersonagem + conteudoArqueiro;
   
    }
    @Override
    public void atacar(){
    System.out.printf("O arqueiro atacou com %s", arma);
    }

}
