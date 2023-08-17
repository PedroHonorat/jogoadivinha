import java.util.Random;
import java.util.Scanner;

public class Jogo{
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        String regras;
        int tentativas = 0;


        regras = """
                \n1-Maximo de 5 tentativas
                2-Apenas numeros de 1 a 100
                """;
        System.out.printf("bem-vindo ao jogo de adivinha");
        System.out.printf(regras);


        while (tentativas < 5) {

            System.out.printf("\nDigite um número: ");
            int numeroDigitado = scanner.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.printf("\nParabens você acertou " + "tentivas " + tentativas);
                break;
            }
            else if (numeroDigitado > numeroGerado) {
                System.out.printf("Digite um número menor");
            }
            else {
                System.out.printf("Digite um número maior");
            }
            if (tentativas == 5){
                System.out.printf("\nGame over você errou 5 vez " + "o gerado foi " + numeroGerado);
                break;
            }
        }
     }
}

