package academy.devdojo.maratonajava;

public class Aula07OperadoresLogicosExecicio {
    static void main(String[] args) {

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 6000;
        float valorPlaystation = 5000f;

        boolean PlayStationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println(PlayStationCompravel);
    }
}
