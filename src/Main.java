import middle.Dvd;
import middle.Libro;
import middle.Negozio;
import middle.RachettaDaPadel;

import java.util.ArrayList;

public class Main {
    static boolean aBoolean;

    public static void main(String[] args) {
        Libro lib1 = new Libro("12x435", "STORIA", "Amore ", 0.5, 45, 200);
        Libro lib2 = new Libro("ZX%&rg", "GUERRA", "SCIENZA ", 1, 50, 140);
        Dvd dv1 = new Dvd("hip hop", "love", 0.5, 5, 5 );
        Dvd dv2 = new Dvd("hip haap", "loverr", 0.5, 2, 7);
        RachettaDaPadel rch1 = new RachettaDaPadel("Rotonda", 1, 10);
        RachettaDaPadel rch2 = new RachettaDaPadel("AGioccia", 1.5, 9);
        System.out.println(lib1.getCategoria());
        System.out.println(lib1.getISBN());
        System.out.println(lib1.getTitolo());
        System.out.println(lib1.getPeso());
        System.out.println(isSup(lib1.getCosto()));
        Negozio nego1 = new Negozio("adias negozio", "001");
        System.out.println(nego1.getCodiceNegozio());
        nego1.addNewlibro(lib1);
        nego1.addNewlibro(lib2);
         dv1.getCosto();
         dv2.getCosto();
        ////





    }// main

    public static boolean isSup(double costo) {
        if (costo > 100) {
            aBoolean = true;
        }
        return aBoolean;
    }


}// class