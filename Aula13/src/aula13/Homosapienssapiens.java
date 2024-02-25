package aula13;
public class Homosapienssapiens extends Mamifero {
    @Override
    public void emitirSom() {
            System.out.println("Falar, Speak, Hablar");
    }
    
    public void reagir(String frase) {
        switch (frase) {
            case "Eu vou te proteger", "Eu te amo S2" -> System.out.println("Você é lindo, You are beautiful/handsome");
            case "Eu vou te matar", "Eu te odeio" -> System.out.println("Você é o problema, You are a problem");
            default -> System.out.println("Falar aham, Speak aham, hablar aham");
        }
    }
        
    public void reagir(int hora, int min) {
        if (hora < 8) {
            System.out.println("Falar lentamente, Speak slowly");
        } else if (hora >= 21) {
            System.out.println("Estou dormindo! zzzzzz, I'm sleeping! zzzzzz");
        } else {
            System.out.println("Falar rapidamente, Speak fastly");
        }
    }
}