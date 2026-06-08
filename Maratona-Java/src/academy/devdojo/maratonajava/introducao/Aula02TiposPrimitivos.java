package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
   public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int age = (int) 1000000000L;
        long bigNumber = (long) 155.23;
        double salaryDouble = 2000.0D;
        float  salarioFloat = 2500;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String name = "goku";

        System.out.println("A idade é " + age + " anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(bigNumber);
        System.out.println("Oi meu nome é  " + name);

    }

}
