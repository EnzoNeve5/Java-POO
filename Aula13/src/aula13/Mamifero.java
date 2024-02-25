package aula13;
public class Mamifero extends Animal {
    protected String corPelo;
    @Override
    public void locomover() {
        System.out.println("Andando");
    }
    @Override
    public void alimentar() {
        System.out.println("Onívoro");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
}