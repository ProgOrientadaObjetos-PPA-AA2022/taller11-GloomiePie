/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public abstract class Menu {
    
    protected String nombrePlato;
    protected double menu;
    protected double valorMenu;
    protected double valorInicial;
    
    public Menu(double d){
        menu = d;
    }
    
    public Menu(String n, double vInicio){
        nombrePlato = n;
        valorInicial = vInicio;
        
    }
    
    public void establecerNombrePlato(String d){
        nombrePlato = d;
    }
    public abstract void establecerValorMenu();
    
    public void establecerValorIncial(double d){
        valorInicial = d;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public double obtenerValorInicial(){
        return valorInicial;
    }
    
}
