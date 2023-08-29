package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComporarBebidaAlcoolica = idade >= 18;
        if (isAutorizadoComporarBebidaAlcoolica) {
            System.out.println(idade+" É autorizado a comporar bebida alcoolica");
        }else{
            System.out.println(idade+" Não é autorizado a comporar bebida alcoolica");
        }

    }
}
