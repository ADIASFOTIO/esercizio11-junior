package middle;

public class Dvd {
   private String titolo;
   private String categoria;
   private double peso;
   private double costo;
   private double durata;
   public Dvd(String titolo, String categoria, double peso, int durata){

    }
    public Dvd(String titolo,String categoria, double peso, double costo,double durata) {
        this.titolo = titolo;
        this.categoria = categoria;
        this.peso = peso;
        this.costo = costo;
        this.durata = durata;
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
    public double getDurata(){
       return durata;
   }
   public String getCategoria(){
       return categoria;
   }









}
