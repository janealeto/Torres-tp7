package entidades;

import java.util.HashSet;

public class Alumno {

    private int legajo;

    private String apellido;

    private String nombre;
    
    HashSet<Materia> materias;

    
    public Alumno(int legajo, String apellido, String Nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = Nombre;
        this.materias=new HashSet<Materia>();
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarMateria(Materia m) {
        return materias.add(m);
         
    }

    public int cantidadMaterias() {
      return materias.size(); 
    }

    @Override
    public String toString() {
        return apellido+", "+nombre;
    }
    
}
