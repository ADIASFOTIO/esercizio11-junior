import middle.Dvd;
import middle.Libro;
import middle.Negozio;
import middle.RachettaDaPadel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libri = new ArrayList<>();
        ArrayList<Dvd> dvds = new ArrayList<>();
        ArrayList<RachettaDaPadel> rachettaDaPadels = new ArrayList<>();
        Dvd dv1 = new Dvd("hip hop", "love", 0.5, 5, 5 );
        Dvd dv2 = new Dvd("hip haap", "loverr", 0.5, 2, 7);
        RachettaDaPadel rch1 = new RachettaDaPadel("Rotonda", 1, 10);
        RachettaDaPadel rch2 = new RachettaDaPadel("AGioccia", 1.5, 9);
        dvds.add(dv1);
        dvds.add(dv2);
        rachettaDaPadels.add(rch1);
        rachettaDaPadels.add(rch2);
        Negozio negozio1 = new Negozio(libri, dvds, rachettaDaPadels);
        negozio1.addDvd("amore", "hiphop",0.5,5,3);
        negozio1.addLibri("lover","SCUOLA","Fantasy",500,3,3);
        negozio1.addLibri("12xrr35", "Students", "needs ", 6000, 45, 200);
        System.out.println(libri.size());

        /// ci permette di andare nell ArrayList per cercare
        for (Dvd c : dvds) {
            double a = c.getDurata();
            System.out.println(a);
        }
        for (Dvd c : dvds) {
            double a = c.getPeso();
            System.out.println(a);
        }//////////
       int num = negozio1.numElments(libri, dvds, rachettaDaPadels);
        System.out.println(num);
        double pesotot = negozio1.pesoTotal(libri,dvds,rachettaDaPadels);
        System.out.println(pesotot);
        negozio1.proDotCostoso(libri,dvds,rachettaDaPadels);







    }// main






}// class