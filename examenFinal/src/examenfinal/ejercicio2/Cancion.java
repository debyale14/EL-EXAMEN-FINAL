/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal.ejercicio2;

/**
 *
 * @author debor
 */
public class Cancion implements Musica {
    
    public String String() {
         System.out.println("Que genero es la canción?");
        return null;
    }

    public String artista() {
        System.out.println("Quien canta la cancion?");
        return null;
    }

    public String idioma() {
       String i= "En que idioma está la canción";
        return i;
    }

    public String nombre() {
        String n= "Como se llama la cancion?";
         return n;
    }

    @Override
    public String genero() {
        String g= "Que genero es la canción?";
        return g;
    }
    
}
