/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author debor
 */
public abstract class Estudiante {
    public String Nombre; 
    public String Carrera;
    public int id;
    
    public void Bienvenido(){
        System.out.println("Bienvenido a la USPG");
    }
    public abstract void Nombre();
    public abstract void Carrera();
    public abstract void id();
}
