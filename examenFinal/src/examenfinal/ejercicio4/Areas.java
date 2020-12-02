/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal.ejercicio4;

import javax.swing.JTextField;

/**
 *
 * @author debor
 */
public class Areas {
    float base=0;
    float altura=0;
    
    public float cuadrado(float base, float altura){
        this.altura=altura;
        this.base=base;
        return base*altura;
    }
    public float rectangulo(float base, float altura){
        this.altura=altura;
        this.base=base;
        return base*altura;
    }
    public float triangulo(float base, float altura){
        this.altura=altura;
        this.base=base;
        return (base*altura)/2;
    }

}
