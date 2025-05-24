package models;

public class Transmision  {

    private String tipo;
    private int marchas;
    private String traccion;

    public Transmision () {}

    public Transmision (String tipo, int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }
    public String gettipo() {
        return tipo;
    }

    public int getmarchas() {
        return marchas;
    }

    public String gettraccion() {
        return traccion;
    }
    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public void setmarchas(int marchas) {
        this.marchas = marchas;
    }

    public void settraccion(String traccion) {
        this.traccion = traccion;
    }

    public void displayInfo(){
        System.err.println("Transmision Information:");
        System.err.println("Tipo: " + tipo);
        System.err.println("Marchas: " + marchas);
        System.err.println("Traccion: " + traccion);
    }
}
