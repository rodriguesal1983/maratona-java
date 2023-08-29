package academy.devdojo.maratonajava.introducao;

import java.util.Date;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "André";
        String address = "Rua Eleutério da Silva Furtado";
        double wage = 5600.0;
        String date = "18/08/2023";

        System.out.println("Eu "+name+", morando no endereço "+address+", confirmo que recebi o salário de "+wage+", na data "+date);
    }

}
