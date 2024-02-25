package aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de PHP POO");
        v[1] = new Video("Aula 15 de HTML5");
        v[2] = new Video("Aula 10 de CSS");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Fernando", 20, "M", "fe");
        g[1] = new Gafanhoto("Juliana", 24, "F", "juju");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}