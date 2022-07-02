/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author Usuario
 */
public class MenuNinios extends Menu{
    
    double valorHelado;
    double valorPastel;
    
    public MenuNinios(double menu){
        super(menu);
    }
    
    public MenuNinios(String nom, double vI, 
            double vH, double vP){
        super(nom, vI);
        valorHelado = vH;
        valorPastel = vP;
        
    }
    
    public void establecerValorHelado(double d){
        valorHelado = d;
    }
    
    public void establecerValorPastel(double d){
        valorPastel = d;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial + valorHelado + valorPastel;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu niños: \n"
                + "Plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor helado: %.2f\n"
                + "Valor pastel: %.2f\n"
                + "Valor menu: %.2f\n",
                nombrePlato, valorInicial,
                valorHelado, valorPastel,
                valorMenu);
        return cadena;
    }
    
}
