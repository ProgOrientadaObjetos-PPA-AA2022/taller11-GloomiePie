/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author SALA I
 */
public class MenuDia extends Menu{
    
    double valorPostre;
    double valorBebida;
    
    public MenuDia(double menu){
        super(menu);
    }
    
    public MenuDia(String n, double vI, 
            double vP, double vB){
        super(n, vI);
        valorPostre = vP;
        valorBebida = vB;
        
    }
    
    public void establecerValorPostre(double d){
        valorPostre = d;
    }
    
    public void establecerValorBebida(double d){
        valorBebida = d;
    }
    
    @Override
    public void establecerValorMenu(){
       valorMenu = valorInicial + valorBebida +  valorPostre;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu del dia: \n"
                + "     Plato: %s\n"
                + "     Valor inicial: %.2f\n"
                + "     Valor del postre: %.2f\n"
                + "     Valor de bebida: %.2f\n"
                + "     Valor menú: %.2f", nombrePlato,
                valorInicial, valorPostre, valorBebida, 
                valorMenu);
        return cadena;
    }
    
}
