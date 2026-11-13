package br.com.igorbusquim.java;

public class Arrays01 {
    static void main(String[] args) {

        // isso é uma variável do tipo reference, não é do tipo primitivo
        int[] idades = null;
        // também poderia ser usado assim: int idades[];
        // obs: somente tipos de variáveis reference podem ser inicalizados como nulo
        System.out.println(idades);

        // toda vez que declarar um array, você tem que dizer quantos de espaço em memória você está alocando
        int[] idades2 = new int[3];
        // caso imprima sem avisar a posição que seja imprimir, será impresso a posição em memória
        System.out.println(idades2);

        // imprimindo a posição 0 do array idades2
        // obs: para tipos reference de variáveis, memso se você não inicializar, automaticamente é inicializado com 0
        System.out.println(idades2[0]);

        // atribuindo valores
        idades2[0] = 18;
        idades2[1] = 20;
        idades2[2] = 22;
        System.out.println(idades2[0]);
        System.out.println(idades2[1]);
        System.out.println(idades2[2]);

    }
}
