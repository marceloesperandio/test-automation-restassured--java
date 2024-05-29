package utilities;

import java.util.Random;

public class DataGenerator {

    public class RandomNumberGenerator {

        public static void main(String[] args) {
            String numero = gerarNumero();
            System.out.println("Número gerado: " + numero);
        }

        public static String gerarNumero() {
            Random rand = new Random();

            int numeroAleatorio = rand.nextInt(1000000000);
            String numeroFormatado = String.format("%09d", numeroAleatorio);
            String numeroFinal = "00" + numeroFormatado.substring(2);
            return numeroFinal;
        }
    }
}