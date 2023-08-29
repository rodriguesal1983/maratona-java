package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int ageInt = 10; //inteiro 4 bytes
        long bigNumber = 100000L; // numero longo 8 bytes
        double wageDouble = 2000.0D; // numero decimal 8 bytes
        float wageFloat = 2500.0F; // numero decimal 4 bytes
        byte ageByte = 127; // 1 byte
        short ageShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1bit
        boolean falso = false; // 1 bit
        char caracter = 'M'; // 2 bytes
        String name = "Goku"; // não é primitivo


        System.out.println("A idade é "+ageInt+" anos.");
        System.out.println("O número é "+bigNumber);
        System.out.println("O salário é "+wageDouble);
        System.out.println("O salário é "+wageFloat);
        System.out.println("A idade é "+ageByte+" anos.");
        System.out.println("A idade é "+ageShort+" anos.");
        System.out.println("Verdadeiro "+verdadeiro);
        System.out.println("Falso "+falso);
        System.out.println("caracter "+caracter);
        System.out.println("Oi! Meu nome é "+name);
    }
}