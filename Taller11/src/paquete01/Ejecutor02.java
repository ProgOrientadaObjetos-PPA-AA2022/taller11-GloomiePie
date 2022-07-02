/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.Cuenta;
import java.util.ArrayList;
import paquete02.Menu;
import paquete03.MenuCarta;
import paquete03.MenuDia;
import paquete03.MenuEcono;
import paquete03.MenuNinios;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        double men = 0.4;
        MenuCarta mc = new MenuCarta(men);
        MenuCarta mc2 = new MenuCarta("Carta 001", 6, 1.5, 2, 10);
        mc2.establecerValorMenu();
        lista.add(mc2);
        MenuCarta mc3 = new MenuCarta("Carta 002", 7, 1.7, 2.1, 5);
        mc3.establecerValorMenu();
        lista.add(mc3);
        MenuCarta mc4 = new MenuCarta("Carta 003", 8, 1.9, 2.2, 5);
        mc4.establecerValorMenu();
        lista.add(mc4);
        MenuCarta mc5 = new MenuCarta("Carta 004", 9, 2.5, 2.9, 5);
        mc5.establecerValorMenu();
        lista.add(mc5);
        
        
        MenuDia md = new MenuDia(men);
        MenuDia md2 = new MenuDia("Dia 001", 5, 1, 1);
        md2.establecerValorMenu();
        lista.add(md2);
        MenuDia md3 = new MenuDia("Dia 002", 6, 2, 2);
        md3.establecerValorMenu();
        lista.add(md3);
        MenuDia md4 = new MenuDia("Dia 003", 5.5, 3, 1);
        md4.establecerValorMenu();
        lista.add(md4);
       
        
        MenuEcono me = new MenuEcono(men);
        MenuEcono me2 = new MenuEcono("Econo 001", 4, 25);
        me2.establecerValorMenu();
        lista.add(me2);
        MenuEcono me3 = new MenuEcono("Econo 002", 4, 15);
        me3.establecerValorMenu();
        lista.add(me3);
        MenuEcono me4 = new MenuEcono("Econo 003", 4, 35);
        me4.establecerValorMenu();
        lista.add(me4);
        
        
        MenuNinios mn = new MenuNinios(men);
        MenuNinios mn2 = new MenuNinios("Niños 01", 2, 1, 1.5);
        mn2.establecerValorMenu();
        lista.add(mn2);
        MenuNinios mn3 = new MenuNinios("Niños 02", 3, 1, 1.5);
        mn3.establecerValorMenu();
        lista.add(mn3);
        MenuNinios mn4 = new MenuNinios("Niños 03", 2, 2, 0.5);
        mn4.establecerValorMenu();
        lista.add(mn4);
        

        // Fin de solución
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorTotal();
        System.out.printf("%s\n", miCuenta);

    }
}
