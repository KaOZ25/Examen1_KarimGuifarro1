/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_karimguifarro;


public class ElYeizoBorjis extends Personas{
 int desaparecidos;

    public ElYeizoBorjis(String nombre, String edad, String sexo, String arma,int desaparecidos) {
        super(nombre, edad, sexo, arma);
        this.desaparecidos = desaparecidos;
    }

    public int getDesaparecidos() {
        return desaparecidos;
    }

    public void setDesaparecidos(int desaparecidos) {
        this.desaparecidos = desaparecidos;
    }

    @Override
    public String toString() {
        return "ElYeizoBorjis{" + "desaparecidos=" + desaparecidos + '}';
    }
 
}
