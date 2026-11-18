package br.com.igorbusquim.javacore.introducaoclasses.test;
/*
* Importação é usada para o java reconhecer/encontrar classes, interfaces e membros que estão em outros pacotes
* */

import br.com.igorbusquim.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        /*
        * Temos uma variável de referência do tipo estudante em 'Estudante estudante'
        * Criar objetos:
        *  - sempre precisamos utilizar a palavra 'new' e em seguida o nome do objetos que queremos criar
        *  - ex; 'new Estudante();'
        * */
        Estudante estudante = new Estudante();

        /*
        * Colocar valores dentro dos atributos de Estudante
        * Como o objeto é do tipo estudante e a variável de referência também é do tipo estudante, só conseguimos acessar
        * os atributos da classe Estudante por meio da variável de referência 'estudante. ...'
        * */
        estudante.nome = "Igor";
        estudante.idade = 21;
        estudante.sexo = 'M';

        /*
        * Imprimindo
        * */
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        /*
        * Imprimindo apenas a variável de referência estudante
        * Temos apenas o endereço de memória, por conta de ser uma variável do tipo reference
        * É neste espaço de memória que nosso objeto está alocado
        * */
        System.out.println(estudante);
    }
}
