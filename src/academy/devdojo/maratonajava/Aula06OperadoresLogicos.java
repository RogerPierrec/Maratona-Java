package academy.devdojo.maratonajava;

public class Aula06OperadoresLogicos {
    public static void main(String[] args) {
        //  Operadores Lógicos:   &&  ||  !

         int idade = 20;
         float salario = 3800F;
         boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
         boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
         System.out.println("IsDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
         System.out.println("IsDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
    }
}
