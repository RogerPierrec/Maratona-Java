package academy.devdojo.maratonajava;

/*
* Prática
*
* Crie variáveis para os campos descritos abaixo etre <> e iprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereço>,
* confirmo que recebi o salário de <salario>, na data <data>
* */

public class Aula03TiposPrimitivosExercicio {
    static void main(String[] args) {

        String nome = "Roger";
        String endereco = "Rua Lago do Sobradinho 18";
        double salario = 2500.00;
        String dataRecebiumento = "22/06/2026";
        String relatorio = "Eu " +nome+ " morando no endereço " +endereco+ " confirmo que recebi o salário de R888888$" +salario+ ", na data " +dataRecebiumento;
        System.out.println(relatorio);

       //System.out.println("Eu " +nome+ ", morando no endereço " +endereco+ ", confirmo que recebi o salário de R$" +salario+ ", na data " + dataRecebiumento);
    }
}



