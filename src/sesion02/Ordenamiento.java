package sesion02;

/**
 *
 * @author julio Manrique Moreno
 */
public class Ordenamiento {
    // Burbuja
    // Seleccion
    // Shell
    // QuickSort

    public int[] DevuelveArreglo(int nValores, int nMinimo, int nMaximo) {

        int[] numeros = new int[nValores];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = DevuelveNumeroAleatorio(nMinimo, nMaximo);
        }

        return numeros;
    }

    private int DevuelveNumeroAleatorio(int nMinimo, int nMaximo) {
        int nValorDevuelto = 0;

        nValorDevuelto = (int) (Math.random() * (nMaximo - nMinimo));

        return nValorDevuelto;
    }

    public static void QuickSort(int[] vector, int izquierda, int derecha) {
        int pivote, i, j, auxintercambio = 0;

        pivote = vector[izquierda];
        i = izquierda;
        j = derecha;
        auxintercambio = 0;

        while (i < j) {

            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxintercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxintercambio;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            QuickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(vector, j + 1, derecha);
        }
    }

    public static void burbuja(int[] Vector) {
        int i, j, aux;
        for (i = 0; i < Vector.length - 1; i++) {
            for (j = 0; j < Vector.length - i - 1; j++) {
                if (Vector[j + 1] < Vector[j]) {
                    aux = Vector[j + 1];
                    Vector[j + 1] = Vector[j];
                    Vector[j] = aux;
                }
            }
        }
    }

    public static void shell(int[] ARREGLO) {
        int salto, aux, i;
        boolean cambios;
        for (salto = ARREGLO.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { // Mientras se intercambie algún elemento
                cambios = false;
                for (i = salto; i < ARREGLO.length; i++) // se da una pasada
                {
                    if (ARREGLO[i - salto] > ARREGLO[i]) { // y si están desordenados
                        aux = ARREGLO[i]; // se reordenan
                        ARREGLO[i] = ARREGLO[i - salto];
                        ARREGLO[i - salto] = aux;
                        cambios = true; // y se marca como cambio.
                    }
                }
            }
        }
    }
    
    public static void insercion(int Arreglo[]){
    int p, j;
    int aux;
    for (p = 1; p < Arreglo.length; p++){ // desde el segundo elemento hasta
              aux = Arreglo[p]; // el final, guardamos el elemento y
              j = p - 1; // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < Arreglo[j])){ // mientras queden posiciones y el
                                                                    // valor de aux sea menor que los
                             Arreglo[j + 1] = Arreglo[j];       // de la izquierda, se desplaza a
                             j--;                   // la derecha
              }
              Arreglo[j + 1] = aux; // colocamos aux en su sitio
    }
}

}
