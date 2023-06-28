package Sobrescrita.Jogo;

public class Main {
    public static void main(String[] args) {
       try{ Personagem personagem= new Personagem("Wilson");
        System.out.println(personagem);
        personagem.atacar();
        Arqueiro arqueiro= new Arqueiro("Panturra");
        System.out.println(arqueiro);
        arqueiro.atacar();
        arqueiro.atacarSemArma();
    }catch(Exception e){
        System.out.println("Erro inesperado.");
    }
   
}
}
