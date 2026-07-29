package academy.devdojo.maratonajava;

public class Aula09EstruturaCondicionaisIF {
    public static void main(String[] args) {

        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida){
            System.out.println("Você está autorizado a comprar bebida alcólica");
        }  else  {
            System.out.println("Você não está autorizado a comprar bebida alcólica");
        }

    }
}
