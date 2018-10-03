package sesion02;

import javax.swing.JOptionPane;

/**
 *
 * @author julio Manrique Moreno
 */
public class Sesion02 {

    public static void main(String[] args) {
        int nCantidadDatos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos "));
        int nValorMinimo = 0;
        int nValorMaximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor maximo "));

        int[] oArreglo = new int[nCantidadDatos];

        Ordenamiento oClsOrdenamiento = new Ordenamiento();

        System.out.println("EJEMPLO ORDENAMIENTO");

        oArreglo = oClsOrdenamiento.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);

        // Impresion de Arreglo
        System.out.println("\n");
        System.out.print("Arreglo Aleatorio\n");
        for (int n : oArreglo) {
            System.out.print(" " + n);
        }
        System.out.println("\n");

        //IMPRESIÓN DEL CUADRO COMPARATIVO
        System.out.println("Cantidad de registros: " + nCantidadDatos);
        System.out.println("Método      |   Tiempo de ordenamiento");
        System.out.println("---------------------------------------");

        long nInicioTiempo = System.currentTimeMillis();
        Ordenamiento.QuickSort(oArreglo, 0, oArreglo.length - 1);
        long nRetardoTiempo = System.currentTimeMillis() - nInicioTiempo;
        System.out.println("QuickSort   |       " + nRetardoTiempo);
        System.out.println("Arreglo Ordenado por QuickSort \n");
        for (int n : oArreglo) {
            System.out.print(" " + n);
        }
        System.out.println("\n");
        
        long InicioTiempo = System.currentTimeMillis();
        Ordenamiento.burbuja(oArreglo);
        nRetardoTiempo = System.currentTimeMillis() - InicioTiempo;
        System.out.println("Burbuja     |       " + nRetardoTiempo);
        System.out.print("Arreglo Ordenado por Burbuja \n");
        for (int n : oArreglo) {
            System.out.print(" " + n);
        }
        System.out.println("\n");
        
        long InicioT = System.currentTimeMillis();
        Ordenamiento.shell(oArreglo);
        nRetardoTiempo = System.currentTimeMillis() - InicioT;
        System.out.println("Shell       |       " + nRetardoTiempo);
        System.out.print("Arreglo Ordenado por Shell \n");
        for (int n : oArreglo) {
            System.out.print(" " + n);
        }
        System.out.println("\n");
        
        long nInicioTie = System.currentTimeMillis();
        Ordenamiento.insercion(oArreglo);
        nRetardoTiempo = System.currentTimeMillis() - nInicioTie;
        System.out.println("Insercion   |       " + nRetardoTiempo);
        System.out.print("Arreglo Ordenado por Insercion \n");
        for (int n : oArreglo) {
            System.out.print(" " + n);
        }
    }

}
