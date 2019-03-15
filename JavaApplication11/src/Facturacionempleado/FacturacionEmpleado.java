/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facturacionempleado;

import java.util.Scanner;

/**
 *
 * @author gerber23
 */
public class FacturacionEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opc = 0;
        Scanner read = new Scanner(System.in);

        do {

            menu();
            opc = read.nextInt();
            switch (opc) {

                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
//                    case 5:{
//                        default;
//                }

            }

        }while(true);
    }
    
    
     public static void menu() {
        System.out.println("1.Ingresar producto");
        System.out.println("2.Realizar venta");
        System.out.println("3.Consultar Inventario");
        System.out.println("4.Ventas totales");
        System.out.println("5.Salir");

        System.out.println("Digite una opcion:");
    }

}
