package leituradelivro;

public class LeituraDeLivro {

    public static void main(String[] args) {
                
        LerUmLivro c0 = new LerUmLivro();
        c0.parte = 0;
        c0.ter();
        c0.status();
        c0.ler();
        
        LerUmLivro c1 = new LerUmLivro();
        c1.parte = 1;
        c1.ter();
        c1.status();
        c1.ler();
        
        LerUmLivro c2 = new LerUmLivro();
        c2.parte = 2;
        c2.ter();
        c2.status();
        c2.ler();
        
        LerUmLivro c3 = new LerUmLivro();
        c3.parte = 3;
        c3.ter();
        c3.status();
        c3.ler();
        
        LerUmLivro c4 = new LerUmLivro();
        c4.parte = 4;
        c4.ter();
        c4.status();
        c4.ler();
        
        LerUmLivro c5 = new LerUmLivro();
        c5.parte = 5;
        c5.naoter();
        c5.status();
        c5.ler();
    }
}
