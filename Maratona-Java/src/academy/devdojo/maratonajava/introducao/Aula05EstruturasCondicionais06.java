package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo - Não é dia util");
                break;
            case 2:
                System.out.println("Segunda - é dia util");
                break;
            case 3:
                System.out.println("Terça - é dia util");
                break;
            case 4:
                System.out.println("Quarta - é dia util");
                break;
            case 5:
                System.out.println("Quinta - é dia util");
                break;
            case 6:
                System.out.println("Sexta - é dia util");
                break;
            case 7:
                System.out.println("Sabado - Não é dia util");
                break;

            default:
                System.out.println("Opção inválida");

                // Outra forma de fazer o exercício

            }
        byte dia2 = 5;
        switch (dia2) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("opção inválida");
                break;

        }
    }
}
