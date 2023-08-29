package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03{
        public static void main(String[] args) {
    // Doar se salario > 5000
    double salario = 3000;
    String mensagemDoar = "Eu vou doar 50 pro DevDojo";
    String mensagemNaoDoar = "Ainda não tenho condições";
    // (condição) ? verdadeiro : falso
    String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

            System.out.println(resultado);

    }
}
