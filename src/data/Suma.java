/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Nicolás Velásquez
 */
public class Suma {
    
    private int inicio;
    private int fin;
    private int factor1;
    private int factor2;
    private int resultado;
    private int señuelo1;
    private int señuelo2;

    public Suma(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public void definir(){
        this.factor1 = (int)(this.inicio+Math.round(Math.random()*(this.fin-this.inicio)));
        this.factor2 = (int)(this.inicio+Math.round(Math.random()*(this.fin-this.inicio)));
        this.resultado = this.factor1 + factor2;
        do{
        this.señuelo1 = (int)(this.inicio+Math.round(Math.random()*(this.fin-this.inicio)));
        this.señuelo2 =(int)(this.inicio+Math.round(Math.random()*(this.fin-this.inicio)));
        }while((this.señuelo1 == this.resultado)||(this.señuelo2 == this.resultado));
        
    }
    
    public boolean validarRespuesta(int respuesta){
        //no 100% seguro de utilizacion
        if(respuesta != this.resultado){
            return false;
        }
        return true;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }

    public int getFactor1() {
        return factor1;
    }

    public int getFactor2() {
        return factor2;
    }

    public int getResultado() {
        return resultado;
    }

    public int getSeñuelo1() {
        return señuelo1;
    }

    public int getSeñuelo2() {
        return señuelo2;
    }

    
}
