package grampeador;

public class Grampeador {
    private final String marca;
    private final String cor;
    public int papeis;
    public boolean grampeada;
    public Grampeador(String m, String c) {
        this.marca = m;
        this.cor = c;
    }
    public void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Um grampeador " + this.cor);
        System.out.println("Papeis: " + this.papeis);
        System.out.println("Tem grampos? " + this.grampeada);
    }
    public void grampear() {
        if (this.grampeada == false) {
            System.out.println("ERRO! Não tenho grampos");
        } else if (this.papeis <= 2 && this.grampeada == true) {
            System.out.println("Estou grampeando para fora");
        } else if (this.papeis >= 3 && this.grampeada == true) {
            System.out.println("Estou grampeando para dentro");    
        } else {
            System.out.println("Informacoes insuficientes");
        }
    }
    
    public void tenhogrampos() {
        this.grampeada = true;
    }
    
    public void naotenhogrampos() {
        this.grampeada = false;
    }
}