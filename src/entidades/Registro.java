/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.HashSet;

/**
 *
 * @author Jannete
 */
public class Registro {
    private HashSet<Materia>materias;
    private HashSet<Alumno>alumnos;

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public Registro(HashSet<Materia> materias, HashSet<Alumno> alumnos) {
        this.materias = materias;
        this.alumnos = alumnos;
    }

    public Registro() {
        this.materias = new HashSet<Materia>();
        this.alumnos = new HashSet<Alumno>();
    }
    public boolean agregarMateria(Materia m){
       
        for(Materia mat:materias){
            if(mat.getIdMateria()==m.getIdMateria()){
                return false;
            }
        }
        
       return materias.add(m);
    }
    public boolean agregarAlumno(Alumno a){
        for(Alumno alu:alumnos){
            if(alu.getNombre()==a.getNombre()){
                return false;
            }
        }
       return alumnos.add(a);
    }
    
    
}
