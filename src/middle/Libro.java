package middle;

public class Libro {
    private String ISBN;
    private String titolo;
    private String categoria;
    private double peso;
    private double costo;
    private int pagine;
    boolean aBoolean;
    public Libro(String ISBN, String titolo, double peso, double durata){

    }
    public Libro(String ISBN, String titolo, String categoria, double peso, double costo,int pagine) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.categoria = categoria;
        this.peso = peso;
        this.costo = costo;
        this.pagine = pagine;
    }
    public double getPeso() {
        return peso;
    }
    public String getTitolo() {
        return titolo;
    }
    public double getCosto() {
        return costo;
    }
    public int getPagine(){
        return pagine;
    }
    public String getCategoria(){
        return categoria;
    }

    public String getISBN() {
        return ISBN;
    }
    public  boolean isSup2() {
        if (costo > 100) {
            aBoolean = true;
        }
        return aBoolean;
    }




}