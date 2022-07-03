/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;


/**
 *
 * @author SALA I
 */
public class Cuenta {
    
    private String nombreCliente;
    private ArrayList<Menu> listaMenu = new ArrayList();
    private Menu menu;
    private double valorTotal;
    private double subtotal = 0;
    private double iva;
    
    public Cuenta(String n, ArrayList m, double i){
        nombreCliente = n;
        iva = i;
        listaMenu = m;
    }
    
    public void establecerNombreCliente(String d){
        nombreCliente = d;
    }
    
    public void establecerMenu(ArrayList d){
        listaMenu = d;
    }
    
    public void establecerSubtotal(){
        for(int i = 0; i < listaMenu.size(); i++){
            subtotal = subtotal + listaMenu.get(i).obtenerValorMenu();
        }
    }
    
    public void establecerIva(double d){
        iva = d;
    }
    
    public void establecerValorTotal(){
        valorTotal = subtotal + subtotal*iva;
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public ArrayList obtenerMenu(){
        return listaMenu;
    }
    
    public double obtenerSubtotal(){
        return subtotal;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    public double obtenerValorTotal(){
        return valorTotal;
    }
    
    @Override
    public String toString(){
        String cadena2 = "";
        for (int i = 0; i < listaMenu.size(); i++){
             cadena2 = String.format("%s\n"
                     + "%s\n",cadena2 , listaMenu.get(i));
        }
        
        String cadena = String.format("Factura\n"
                + "Cliente: %s"
                + "%s\n"
                + "Subtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Total a pagar: %.2f\n", nombreCliente, cadena2,
                obtenerSubtotal(), obtenerIva(), obtenerValorTotal());
        return cadena;
    }
    
}
