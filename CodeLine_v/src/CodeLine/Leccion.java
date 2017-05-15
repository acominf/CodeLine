package CodeLine;

import java.util.ArrayList;

public class Leccion {
    
    private String historia;
    private String desarrollo;
    private String nombreLeccion;
    private boolean status;
    private ArrayList<Ejercicio> ejercicios;
    private String fechaCreacion;
    
    public void addLesson (String historia, String desa, String nombre) {
        setHistoria(historia);
        setNombreLeccion(nombre);
        setDesarrollo(desa);
        ejercicios = new ArrayList<Ejercicio>();
    }
    
    public void setHistoria (String historia) {
        this.historia = historia;
    }
   
    public void setNombreLeccion (String nombre) {
        this.nombreLeccion = nombre;
    }
    
    public void setDesarrollo (String desa) {
        this.desarrollo = desa;
    }
    
    public String getNombre () {
        return nombreLeccion;
    }
    
    public ArrayList<Ejercicio> getEjercicios () {
        return ejercicios;
    }
    
    public String getFechaCreacion () {
        return fechaCreacion;
    }
}
