package br.com.igorbusquim.java;

public class Arrays02 {
    static void main(String[] args) {

        /*
        * Toda vez que é declarado uma variável do tipo primitivo, sendo um array ou uma variável de classe, os tipos primitivos tem os valores padroes
        * Não são aplicados quando está dentro de um escopo local (métodos)
        *
        * byte, short, int, long, float e double - o valor padrão é 0
        * char '\u0000' ' '
        * boolean false
        * OBS: para tipos Reference, como por exemplo String - o valor padrão é null
        * */

        String[] nomes = new String[3];
        nomes[0] = "Cachorro";
        nomes[1] = "Gato";
        nomes[2] = "Papagaio";

        /*
        * arrays: impressão de valores
        *
        * todo array tem uma propriedade dentro dele que diz o seu tamanho
        * ex: nomes.lenght
        *
        * */
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // alterar o tamanho de um array
        // o array nomes agora passa a fazer referencia a esse novo espaço em memória
        // o valor antigo vai ficar em memória até o Garbarge Collector da JVM limpar automaticamente
        nomes = new String[10];
    }
}
