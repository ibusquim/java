package br.com.igorbusquim.javacore.introducaoclasses.test;

import br.com.igorbusquim.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Gasolina";
        carro1.ano = 1998;

        carro2.nome = "Spin";
        carro2.modelo = "Flex";
        carro2.ano = 2013;

        System.out.println("Atributos do carro 1:");
        System.out.println(carro1.nome + ", " + carro1.modelo + ", " + carro1.ano + ".");
        System.out.println("\nAtributos do carro 2:");
        System.out.println(carro2.nome + ", " + carro2.modelo + ", " + carro2.ano + ".");
    }
}
