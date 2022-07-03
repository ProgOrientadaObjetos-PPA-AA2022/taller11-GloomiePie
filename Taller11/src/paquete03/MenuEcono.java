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
public class MenuEcono extends Menu{
    
    double descuento;
    
    public MenuEcono(double menu){
        super(menu);
    }
    
    public MenuEcono(String n, double vI,double des){
        super(n, vI);
        descuento = des;
        
    }
    
    public void establecerDescuento(double d){
        descuento = d;
    }
    
    @Override
    public void establecerValorMenu(){
        valorMenu = valorInicial - (descuento*valorInicial);
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu economico:\n"
                + "     Plato: %s\n"
                + "     Valor inicial: %.2f\n"
                + "     Valor del porcentaje: %.2f\n"
                + "     Valor menú: %.2f", 
                nombrePlato, valorInicial, 
                descuento, valorMenu);
        return cadena;
    }
    
}
