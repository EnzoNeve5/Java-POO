package aula15;
public class Aula15 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de PHP POO");
        v[1] = new Video("Aula 15 de HTML5");
        v[2] = new Video("Aula 10 de CSS");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Fernando", 20, "M", "fe");
        g[1] = new Gafanhoto("Juliana", 24, "F", "juju");
        
        System.out.println("VISUALIZAÇÃO\n---------------------");
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        System.out.println("\nVÍDEOS\n---------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n---------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
    }
}