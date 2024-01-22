package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("João", 21, "M");
        p[1] = new Pessoa("Joana", 19, "F");
        
        l[0] = new Livro("Aprendendo POO", "José Cândido", 300, p[0]);
        l[1] = new Livro("Java para iniciantes", "Enzo Cohen", 500, p[0]);
        l[2] = new Livro("Java Intermediário", "Maria Antonieta", 800, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].folhear(50);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        
        l[2].abrir();
        l[2].folhear(500);
        l[2].avancarPag();
        System.out.println(l[2].detalhes());
    }  
}