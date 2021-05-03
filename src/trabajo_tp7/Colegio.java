package trabajo_tp7;

import entidades.Alumno;
import entidades.Materia;
import entidades.Registro;

public class Colegio {

    public static void main(String[] args) {
        
        Alumno a=new Alumno(1001,"Lopez","Martin");
        Alumno b=new Alumno(1002,"Martinez","Brenda");
        Materia aa = new Materia(01,"Ingles 1",1);
        Materia bb = new Materia(02,"Matematicas",1);
        Materia cc = new Materia(03,"Laboratorio 1",1);
        
        Registro registro = new Registro();
        registro.agregarMateria(aa);
        registro.agregarMateria(bb);
        registro.agregarMateria(cc);
        
        registro.agregarAlumno(a);
        registro.agregarAlumno(b);
        
        a.agregarMateria(aa);
        a.agregarMateria(bb);
        a.agregarMateria(cc);
        
        b.agregarMateria(aa);
        b.agregarMateria(bb);
        b.agregarMateria(cc);
        b.agregarMateria(cc);
        
        System.out.println("La cantidad de materias de Lopez Martin son: " + a.cantidadMaterias());
        System.out.println("La cantidad de materias de Martinez Brenda son: " + b.cantidadMaterias());
        
        
        
        
        
    }
}
