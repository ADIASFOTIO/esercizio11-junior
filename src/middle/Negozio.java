package middle;

public class Negozio {
    public static final int MAX_LIBRI = 100;


    private String nomeNegozio;
    private String codiceNegozio;
    private Libro[] libros;
    private int next;
    public Negozio(String nomeNegozio, String codiceNegozio) {
        this.nomeNegozio = nomeNegozio;
        this.codiceNegozio = codiceNegozio;
        libros = new Libro[MAX_LIBRI];
        next = 0;
    }
    public void addNewlibro(Libro e) {
        libros[next++] = e;
    }
    public String getNomeNegozio() {
        return nomeNegozio;
    }
    public String getCodiceNegozio() {
        return codiceNegozio;
    }




}
