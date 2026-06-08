package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * operadores simples
        int num01 = 10;
        int num02 = 20;
        double resultado = num01 / (double) num02;
        System.out.println(resultado);

        // % resto
        int resto = 21 % 7;
        System.out.println(resto);
        System.out.println("Operadores simples e resto exemplos");
        System.out.println("===================================");

        // < > <= >= == != operadores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        boolean isDezIgualaDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualaVinte "+isDezIgualaVinte);
        System.out.println("isDezIgualaDez "+isDezIgualaDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        System.out.println("Operadores booleanos exemplos");
        System.out.println("===================================");

        // && (AND e) || (OR ou)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4600;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3300;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        int idade2 = 29;
        float salario2 = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta2 = idade2 > 30 && salario2 >= 4600;
        boolean isDentroDaLeiMenorQueTrinta2 = idade2 < 30 && salario2 >= 3300;

        System.out.println("isDentroDaLeiMaiorQueTrinta2 " + isDentroDaLeiMaiorQueTrinta2);
        System.out.println("isDentroDaLeiMenorQueTrinta2 " + isDentroDaLeiMenorQueTrinta2);

        System.out.println("Operadores And exemplos");
        System.out.println("===================================");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Compravel? "+ isPlaystationCincoCompravel);

        System.out.println("Operadores Or exemplos");
        System.out.println("===================================");

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += bonus = 1000; // 2800
        bonus -= bonus = 1000; // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);






    }
}
