package aula11;
public class Tecnico extends Aluno {
    
    public void registroProfissional() {
        System.out.println("O técnico se chama: " + this.nome);
    }
    
    public void praticar() {
        System.out.println(this.nome + " está trabalhando!");
    }
    
}