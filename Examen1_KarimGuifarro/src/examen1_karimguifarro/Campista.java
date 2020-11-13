/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_karimguifarro;

public class Campista extends Personas{
     String Ocupacion;
     String Estado;

    public Campista(String Estado, String nombre, String edad, String sexo, String arma,String Ocupacion) {
        super(nombre, edad, sexo, arma);
        this.Ocupacion = Ocupacion;
        this.Estado = Estado;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Campista{" + "Ocupacion=" + Ocupacion + ", Estado=" + Estado + '}';
    }
     
   

   

   
     
}
