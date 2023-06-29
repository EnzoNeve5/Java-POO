package leituradelivro;

public class LerUmLivro {
    int parte;
    boolean tenho;
    void status() {
        System.out.println("Voce tem livro? " + this.tenho);
        System.out.println("obs:  /0=Iniciando 1=inicio 2=meio 3=finalizando ?=acabou/ Parte: " + this.parte);
    }
    void  ler() {
        if (this.tenho == false) {
            System.out.println("ERRO! Não tenho livro");
        } else if (this.tenho == true && this.parte == 0) {
            System.out.println("Estou Iniciando o livro");    
        } else if (this.tenho == true && this.parte == 1) {
            System.out.println("Estou Lendo no início");    
        } else if (this.tenho == true && this.parte == 2) {
            System.out.println("Estou Lendo na metade");    
        } else if (this.tenho == true && this.parte == 3) {
            System.out.println("Estou Finalizando o livro");    
        } else {
            System.out.println("Já acabou o livro");
        }
    }
    void ter() {
        this.tenho = true;
    }
    
    void naoter() {
        this.tenho = false;
    }
}
