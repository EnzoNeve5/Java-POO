package aula13;
public class Aula13 {
    public static void main(String[] args) {
        // Programa Principal
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir("Vai Apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
        Homosapienssapiens h = new Homosapienssapiens();
        
        h.reagir("Eu te amo S2");
        h.reagir("Eu te odeio");
        h.reagir("Blá Blá Blá, Blah Blah Blah");
        h.reagir(7, 45);
        h.reagir(15, 00);
        h.reagir(22, 00);
        
        Reptil r = new Reptil();
        
        r.emitirSom();
        r.alimentar();
        r.locomover();
        
        Crocodilo k = new Crocodilo();
        
        k.locomover();
    }
}