package praidi;
public class Praidi {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[7];
                
        l[0] = new Lutador("Pretty Boy", "EUA", 31, 1.75f,
                                67.3f, 11, 2, 0);
        l[1] = new Lutador("Andérso Sirva", "Brasil", 25, 1.69f,
                                58.2f, 17, 3, 1);
        l[2] = new Lutador("Homãhhed Lia", "EUA", 32, 1.68f,
                                82.9f, 11, 4, 2);
        l[3] = new Lutador("Deading Codes", "Austrália", 27, 1.94f,
                                80.6f, 13, 0, 2);
        l[4] = new Lutador("Matheus Carvalho", "Brasil", 36, 1.74f,
                                122.8f, 15, 4, 3);
        l[5] = new Lutador("Maiki Taisón", "EUA", 30, 1.84f,
                                105.6f, 13, 1, 4);
        l[6] = new Lutador("Sergei Medvedev", "Rússia", 29, 1.72f,
                                94.7f, 18, 5, 3);
        l[5].apresentar();
        l[6].apresentar();
        l[5].perderLuta();
        l[6].ganharLuta();
        l[5].status();
        l[6].status();
    }
}
