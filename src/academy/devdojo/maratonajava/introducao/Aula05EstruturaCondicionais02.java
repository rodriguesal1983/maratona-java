package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 = categoria infantil
        // idade >= 15 = categoria juvenil
        // idade >= 18 = categoria adulto

        int idade = 17;
        String categoria;

        if(idade < 15){
            categoria = "infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else{
            categoria= "adulto";
        }
        System.out.println(categoria);
    }

}
