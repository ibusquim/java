package br.com.igorbusquim.java;

public class ArraysForeach {
    static void main(String[] args) {
        /*
         * Nova forma de inicializar e imprimir o arrays
         * */

        // nova forma de inicializar
        int[] numeros = {1,2,3,4,5};
        // ou
        int[] numeros2 = new int[]{5,4,3,2,1};

        // nova forma de imprimir
        /*
        *  a variável local 'num' percorre e imprimi cada posição do array
        *  Percorre a posição zero e imprime o valor
        *  Percorre a posição um e imprime o valor...
        * */
        for(int num : numeros2) {
            System.out.println(num);
        }
    }
}
