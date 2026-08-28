package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "SW4";
        carro1.ano = 2010;
        carro1.modelo = "4x4 Traçado";

        System.out.println("\nCarro 1");
        System.out.println("Nome: " + carro1.nome + ", Ano: " + carro1.ano + ", Modelo: " + carro1.modelo);
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        carro2.nome = "Corolla";
        carro2.ano = 2014;
        carro2.modelo = "Manual";

        System.out.println("\nCarro 2");
        System.out.println("Nome: " + carro2.nome + ", Ano: " + carro2.ano + ", Modelo: " + carro2.modelo);
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);


    }
}

