/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.Iterator;

/**
 *
 * @author Administrador
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia m1 = new Materia(1, "Ingles I", 1);
        Materia m2 = new Materia(2, "Matematica", 1);
        Materia m3 = new Materia(3, "Laboratorio I", 1);
        
        Alumno a1 = new Alumno(1001, "López", "Martin");
        Alumno a2 = new Alumno(1002, "Martínez", "Brenda");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        
        System.out.println(a2.cantidadMaterias());
        
        Iterator<Materia> it=a2.materias.iterator();
        
       while (it.hasNext()) {
            Materia m=it.next();
            System.out.println(m.getNombre());
        }
        
        
        
        
    }
    
}
