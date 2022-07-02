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
public class MenuCarta extends Menu{
    
    double valorGuarnicion;
    double valorBebida;
    double porcentaje;
    
    public MenuCarta(double menu){
        super(menu);
    }
    
    public MenuCarta(String n, double m,
            double vG, double vB, double p){
        super(n, m);
        valorGuarnicion = vG;
        valorBebida = vB;
        porcentaje = p;
        
    }
    
    public void establecerValorGuarnicion(double d){
        valorGuarnicion = d;
    }
    
    public void establecerValorBebida(double d){
        valorBebida = d;
    }
    
    public void establecerPorcentaje(double d){
        porcentaje = d;
    }
    
    @Override
    public void establecerValorMenu(){
      valorMenu = valorInicial + valorGuarnicion + valorBebida + 
              (porcentaje*valorInicial);  
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menú a la carta:\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: %.2f\n"
                + "Valor guarnición: %.2f\n"
                + "Valor bebida: %.2f\n"
                + "Porcentaje adicional por "
                + "servicio: %.2f\n "
                + "Valor menú: %.2f\n", 
                nombrePlato, valorInicial,
                valorGuarnicion, valorBebida,
                porcentaje, valorMenu);
        return cadena;
    }
}
