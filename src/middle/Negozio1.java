package middle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Negozio1 {
    public Negozio1(){
    }
    public Negozio1(ArrayList<Libro> libri, ArrayList<Dvd> dvds, ArrayList<RachettaDaPadel> rachettaDaPadels){
        this.libri = libri;
        this.dvds = dvds;
        this.rachettaDaPadels = rachettaDaPadels;
    }
    private ArrayList<Libro>  libri;
    private ArrayList<Dvd>    dvds;
    private ArrayList<RachettaDaPadel> rachettaDaPadels;


    public ArrayList<Libro> libri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    public ArrayList<Dvd> dvds() {
        return dvds;
    }

    public void setDvds(ArrayList<Dvd> dvds) {
        this.dvds = dvds;
    }

    public ArrayList<RachettaDaPadel> rachettaDaPadels() {
        return rachettaDaPadels;
    }

    public void setRachettaDaPadels(ArrayList<RachettaDaPadel> rachettaDaPadels) {
        this.rachettaDaPadels = rachettaDaPadels;
    }
    public void addLibri(String ISBN, String titolo, String categoria, double costo, double peso, int durata){
        Libro l = new Libro(ISBN, titolo, categoria, costo, peso, durata);
        libri.add(l);
    }
    public void addDvd(String titolo, String categoria, double peso, int durata) {
        Dvd d = new Dvd(titolo, categoria, peso, durata);
        dvds.add(d);
    }
    public void addRachettaDaPadels(String marca, double peso, double costo) {
        RachettaDaPadel r = new RachettaDaPadel(marca, peso, costo);
        rachettaDaPadels.add(r);
    }
    public int numElments (ArrayList<Libro> libri, ArrayList<Dvd> dvds, ArrayList<RachettaDaPadel> rachettaDaPadels){
          int a =libri.size();
          int b = dvds.size();
          int c = rachettaDaPadels.size();
        return a + b + c ;
    }
    public double pesoTotal(ArrayList<Libro> libri, ArrayList<Dvd> dvds, ArrayList<RachettaDaPadel> rachettaDaPadels) {
        double sum1 = 0;
        for (Libro c : libri) {
           double a = c.getPeso();
           sum1 = sum1 + a;
        }
        double sum2 =0;
        for (Dvd d : dvds){
            double b = d.getPeso();
            sum2 = sum2 + b;
        }
        double sum3 = 0;
        for (RachettaDaPadel r : rachettaDaPadels ){
            double c = r.getPeso();
            sum3 = sum3 + c;
        }

       return sum1 + sum2 + sum3;
    }



}
