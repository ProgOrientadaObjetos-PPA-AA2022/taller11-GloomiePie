/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Cuenta;
import paquete02.Menu;
import paquete03.MenuCarta;
import paquete03.MenuDia;
import paquete03.MenuEcono;
import paquete03.MenuNinios;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> lista = new ArrayList<>();
        double men = 0.4;
        
        MenuNinios mn = new MenuNinios(men);
        MenuNinios mn2 = new MenuNinios("Niños 01", 2, 1, 1.5);
        lista.add(mn2);
        MenuNinios mn3 = new MenuNinios("Niños 02", 3, 1, 1.5);
        lista.add(mn3);
        
        MenuEcono me = new MenuEcono(men);
        MenuEcono me2 = new MenuEcono("Econo 001", 4, 0.25);
        lista.add(me2);
        
        MenuDia md = new MenuDia(men);
        MenuDia md2 = new MenuDia("Dia 001", 5, 1, 1);
        lista.add(md2);
        
        MenuCarta mc = new MenuCarta(men);
        MenuCarta mc2 = new MenuCarta("Carta 001", 6, 1.5, 2, 0.10);
        lista.add(mc2);
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        Cuenta miCuenta = new Cuenta("René Elizalde", lista, 0.10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorTotal();
        System.out.printf("%s\n", miCuenta);

    }
}

// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/
