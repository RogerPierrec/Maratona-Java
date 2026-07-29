package academy.devdojo.maratonajava;

import javax.sound.midi.SoundbankResource;

public class Aula05OperadoresRelacionais {
    static void main(String[] args) {

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        //  < >   <=   >=   ==   !=
        // sempre vão retornar valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("Dez maior que vinte: " + isDezMaiorQueVinte);
        System.out.println("Dez menor que vinte: " + isDezMenorQueVinte);
        System.out.println("Dez igual a vinte: " + isDezIgualVinte);
        System.out.println("Dez igual a dez: " + isDezIgualDez);
        System.out.println("Dez diferente de dez: " + isDezDiferenteDez);
        System.out.println("Dez diferente de vinte: " + isDezDiferenteVinte);

    }
}
