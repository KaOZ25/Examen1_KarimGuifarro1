/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_karimguifarro;
public class Arma {
    private double daño;
    private String nombre;

    public Arma() {
    }

    public Arma(double daño, String nombre) {
        this.daño = daño;
        this.nombre = nombre;
    }

   
    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
