package ventilador;

public class FuncaoDoVentilador {
    String marca;
    String cor;
    int nivel;
    int helices;
    boolean ligada;
    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Um ventilador " + this.cor);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("Helices: " + this.helices);
        System.out.println("Está conectado na tomada? " + this.ligada);
    }
    void  ventilar() {
        if (this.ligada == false) {
            System.out.println("ERRO! Não posso ventilar");
        } else if (this.nivel == 0 && this.ligada == true) {
            System.out.println("Estou desligado");
        } else if (this.nivel >= 1 && this.ligada == true) {
            System.out.println("Estou ventilando");    
        } else {
            System.out.println("Informacoes insuficientes");
        }
    }
    
    void ligar() {
        this.ligada = true;
    }
    
    void desligar() {
        this.ligada = false;
    }
}