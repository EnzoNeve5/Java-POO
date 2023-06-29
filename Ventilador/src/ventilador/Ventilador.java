package ventilador;

public class Ventilador {

    public static void main(String[] args) {
        FuncaoDoVentilador c1 = new FuncaoDoVentilador();
        c1.marca = "Mondial";
        c1.cor = "Branco";
        c1.nivel = 0;
        c1.helices = 3;
        c1.ligar();
        c1.status();
        c1.ventilar();
        
        FuncaoDoVentilador c2 = new FuncaoDoVentilador();
        c2.marca = "Arno";
        c2.cor = "Preto";
        c2.nivel = 1;
        c2.helices = 4;
        c2.desligar();
        c2.status();
        c2.ventilar();
        
        FuncaoDoVentilador c3 = new FuncaoDoVentilador();
        c3.marca = "Arno";
        c3.cor = "Azul";
        c3.nivel = 2;
        c3.helices = 6;
        c3.ligar();
        c3.status();
        c3.ventilar();
    }
    
}