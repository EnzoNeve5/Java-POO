package grampeador;

public class Grampo {

    public static void main(String[] args) {
        Grampeador c1 = new Grampeador("CIB", "Branco");
        c1.papeis = 20;
        c1.tenhogrampos();
        c1.status();
        c1.grampear();
        
        Grampeador c2 = new Grampeador("CIB", "Preto");
        c2.papeis = 1;
        c2.naotenhogrampos();
        c2.status();
        c2.grampear();
        
        Grampeador c3 = new Grampeador("CIB", "Cinza");
        c3.papeis = 2;
        c3.tenhogrampos();
        c3.status();
        c3.grampear();
        
        Grampeador c4 = new Grampeador("CIB", "Amarelo");
        c4.papeis = 0;
        c4.tenhogrampos();
        c4.status();
        c4.grampear();
    }
    
}