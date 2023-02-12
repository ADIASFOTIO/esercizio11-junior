package middle;

import java.util.ArrayList;

public class Negozio {
    public Negozio(ArrayList<Libro> libri, ArrayList<Dvd> dvds, ArrayList<RachettaDaPadel> rachettaDaPadels){
        this.libri = libri;
        this.dvds = dvds;
        this.rachettaDaPadels = rachettaDaPadels;
    }
    private ArrayList<Libro>  libri;
    private ArrayList<Dvd>    dvds;
    private ArrayList<RachettaDaPadel> rachettaDaPadels;


    public ArrayList<Libro> getLibri() {
        return libri;
    }

    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    public ArrayList<Dvd> getDvds() {
        return dvds;
    }

    public void setDvds(ArrayList<Dvd> dvds) {
        this.dvds = dvds;
    }

    public ArrayList<RachettaDaPadel> getRachettaDaPadels() {
        return rachettaDaPadels;
    }

    public void setRachettaDaPadels(ArrayList<RachettaDaPadel> rachettaDaPadels) {
        this.rachettaDaPadels = rachettaDaPadels;
    }
    public void addLibri(String ISBN, String titolo, String categoria, double costo, double peso, int durata){
        Libro l = new Libro(ISBN, titolo, categoria, costo, peso, durata);
        libri.add(l);
    }
    public void addDvd(String titolo, String categoria, double peso,double costo, int durata) {
        Dvd d = new Dvd(titolo, categoria, peso,costo, durata);
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
    public Libro libroCostoso(ArrayList<Libro> libri) {
        double priceMax1 = 0;
        Libro libropriMax = null;
        for (int i = 0; i < libri.size(); i++) {
            double price = libri.get(i).getCosto();
            if (price > priceMax1) {
                priceMax1 = price;
                libropriMax = libri.get(i);
            }
        }
        return libropriMax;
    }

    public Dvd dvdcostoso(ArrayList<Dvd> dvds) {
        double priceMax2 = 0;
        Dvd dvdpriMax = null;
        for (int i = 0; i < dvds.size(); i++) {
            double price = dvds.get(i).getCosto();
            if (price > priceMax2) {
                priceMax2 = price;
                dvdpriMax = dvds.get(i);
            }
        }
        return dvdpriMax;
    }
    public RachettaDaPadel rachettaDaPadelscostoso(ArrayList<RachettaDaPadel> rachettaDaPadels){
        double priceMax3 = 0;
        RachettaDaPadel rachettaDaPadelspriMax = null;
        for (int i = 0; i < rachettaDaPadels.size(); i++) {
            double price = rachettaDaPadels.get(i).getCosto();
            if (price > priceMax3) {
                priceMax3 = price;
                rachettaDaPadelspriMax = rachettaDaPadels.get(i);
            }
        }
        return rachettaDaPadelspriMax;
    }
    public void proDotCostoso(ArrayList<Libro> libri, ArrayList<Dvd> dvds, ArrayList<RachettaDaPadel> rachettaDaPadels){
        Libro a = null;
        Dvd b = null;
        RachettaDaPadel c = null;
        a = libroCostoso( libri);
        b = dvdcostoso(dvds);
        c = rachettaDaPadelscostoso(rachettaDaPadels);
        double a1 = a.getCosto();
        double a2 = b.getCosto();
        double a3 = c.getCosto();



    }









}



}
