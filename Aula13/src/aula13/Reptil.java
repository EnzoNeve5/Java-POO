package aula13;
public class Reptil extends Animal {
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Carnívoro");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
}