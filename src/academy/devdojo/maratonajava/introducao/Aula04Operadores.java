package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        int result = number02/number01;
       // System.out.println(number02/number01);
       // System.out.println(result);

        //%
        int resto = 20 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);

        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);

        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezDiferenteQueVinte "+isDezDiferenteQueVinte);

        // && (and), || (or),  ! ()
        int age = 35;
        float wage = 3500F;
        boolean isdentroDaLeiMaiorQueTrinta = age > 35 && wage >= 4612;
        boolean isdentroDaLeiMenorQueTrinta = age < 35 && wage >= 3381;
        System.out.println("isdentroDaLeiMaiorQueTrinta "+isdentroDaLeiMaiorQueTrinta);
        System.out.println("isdentroDaLeiMenorQueTrinta "+isdentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystattionCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystattionCincoCompravel "+isPlaystattionCincoCompravel);

        // = (atribuição), +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus -= + 1000;
        System.out.println(bonus);

        //
        int contador = 0;
        contador *= 1; // contador +1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
