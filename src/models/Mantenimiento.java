package models;

public class Mantenimiento {

    private String historial;
    private String programacion;

    public Mantenimiento () {}

    public Mantenimiento (String historial, String programacion) {
        this.historial = historial;
        this.programacion = programacion;
    }

    public String gethistorial() {
        return historial;
    }

    public String getprogramacion() {
        return programacion;
    }
    public void sethistorial(String historial) {
        this.historial = historial;
    }

    public void setprogramacion(String programacion) {
        this.programacion = programacion;
    }

    public void displayInfo(){
        System.err.println("Mantenimiento Information:");
        System.err.println("historial: " + historial);
        System.err.println("programacion: " + programacion);
    }
}