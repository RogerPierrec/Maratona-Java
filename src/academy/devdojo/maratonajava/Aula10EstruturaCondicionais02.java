package academy.devdojo.maratonajava;

public class Aula10EstruturaCondicionais02 {
    public static void main(String[] args) {
        // idade <= 12 categoria infantil
        // idade > 12 categoria juvenil
        // idade >= 18 categoria adulto
        // idade >= 60 categoria idoso

        int idade = 70;
        if (idade <= 12){
            System.out.println("Categoria infantil");
        } else if (idade > 12 && idade < 18){
            System.out.println("Caregoria juvenil");
        } else if (idade >= 18 && idade < 60){
            System.out.println("Categoria adulto");
        } else {
            System.out.println("Categoria idoso");
        }
    }
}
