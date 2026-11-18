package br.com.igorbusquim.java;

public class ArraysMultidimensionais02 {
    static void main(String[] args) {
        int[] array = {1,2,3,5,6,9,1,3,6};
        // array multidimensional com 3 posições
        int[][] arrayInt = new int[3][];

        /*
        * Inicialização do array miltidimensional:
        * - podemos colocar em cada posição do array, arrays com diferentes tamanhos
        * */

        arrayInt[0] = new int[2]; // a posição 1 do array de 3 posições faz referência a um array de 2 posições
        arrayInt[1] = new int[3]; // a posição 2 do array de 3 posições faz referência a um array de 3 posições
        arrayInt[2] = new int[6]; // a posição 3 do array de 3 posições faz referência a um array de 6 posições

        System.out.print("Imprimindo apenas com os valores padrões, sem inicialização: ");
        for(int[] arrayBase: arrayInt){
            System.out.print("\n");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        arrayInt[0] = new int[]{1,2,3,4};
        arrayInt[1] = array; // este array inicializado no inicio do código
        arrayInt[2] = new int[]{3,3,3,6,4,6};

        System.out.print("Imprimindo com os valores inicializados: ");
        for(int[] arrayBase: arrayInt){
            System.out.print("\n");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }
        /*
        * Inicializando um array multidimensional diretamente
        * */
        System.out.println("\n");

        int[][] arrayInt2 = {{9,9},{4,5,6,7,8,9},{1,2,3,5}};

        for(int[] arrayBase: arrayInt2){
            System.out.print("\n");
            for(int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
