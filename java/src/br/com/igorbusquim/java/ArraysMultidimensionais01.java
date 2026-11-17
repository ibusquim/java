package br.com.igorbusquim.java;

public class ArraysMultidimensionais01 {
    static void main(String[] args) {
        int[][] dias = new int[3][3];
        /*
        *  Imprimindo as posições da base
        * */
        System.out.println(dias[0]);
        System.out.println(dias[1]);
        System.out.println(dias[2]);

        /*
        *  Atribuindo valores as posições dos arrays
        * */
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 28;
        dias[2][2] = 31;

        /*
        *  Imprimindo arrays multidimensionais
        * */
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }

        }

        /*
        *  imprimindo arrays multidimensionais com for-each
        *
        *  cada posição da base não é mais um inteiro, mas sim um array de inteiros, então temos que usar 'int[] arrayBase'
        *  cada posição do array de inteiros dentro de cada base é um tipo inteiro, então temos que usar 'int num'
        * */

        System.out.println("Impressão com foreach");

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }

    }
}
