package br.com.igorbusquim.javacore.introducaoclasses.test;

import br.com.igorbusquim.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    /*
    * Imprimindo em uma linha
    * */

    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Thiaguinho";
        professor.idade = 56;
        professor.sexo = 'M';

        System.out.println(professor.nome + ", " + professor.idade + ", " + professor.sexo + ".");

    }
}
