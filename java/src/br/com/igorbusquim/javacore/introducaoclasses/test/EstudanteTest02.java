package br.com.igorbusquim.javacore.introducaoclasses.test;

import br.com.igorbusquim.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        /*
        * Criando um objeto sem nenhuma variável de referência
        * Estamos criando um espaço em memória que tem os atributos de estudante
        * Porém, não tem como acessar esses atributos, pois não temos nenhuma variável de referência apontando pra ele
        * */
        // new Estudante();  <- exemplo do texto acima

        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Igor";
        estudante1.sexo = 'M';

        estudante2.nome = "Lucas";

        /*
        * Podemos imprimir os valores de Estudante sem serem inicializados
        * Porém, será impresso os valores padrões por se tratar de um tipo reference
        * */
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        System.out.println("---------------");

        /*
        * Como foram criados 3 objetos do tipo Estudante
        * Podemos usar a variável de referência de cada um para inicializar seus atributos
        * */

        System.out.println(estudante1.nome);
        System.out.println(estudante1.sexo);
        System.out.println(estudante1.idade);

        System.out.println("---------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
    }
}
