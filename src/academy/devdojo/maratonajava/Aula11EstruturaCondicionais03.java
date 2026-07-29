package academy.devdojo.maratonajava;

public class Aula11EstruturaCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 700;
        String mensagemDoar = "Eu vou doar 500 para o DevDojo";
        String mensagemNaoDoar = "Eu não tenho condições, mas vou ter";
        String resultado;

        if (salario > 5000){
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
