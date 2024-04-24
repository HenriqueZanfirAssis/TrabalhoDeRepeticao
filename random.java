import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);

        int numeroSecreto = gerador.nextInt(101);
        int tentativasMaximas = 10;
        int tentativas = 0;
        int palpite;

        System.out.println(("Bem-vindo ao Jogo de Adivinhação!"));
        System.out.println("O objetivo é adivinhar o número aleatório entre 1 e 100");

        while(tentativas < tentativasMaximas) {
            tentativas++;
            System.out.println("Tentativa #" + tentativas);
            System.out.println("Digite seu papilte: ");
            palpite = ler.nextInt();

            int distanciaAtual = Math.abs(palpite - numeroSecreto);

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns você acertou o número aleatório: " + numeroSecreto);
                System.out.println("Você utilizou " + tentativas + " tentativas." );
                break;
            }else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            }else {
                System.out.println("Tente um número menor.");
            }

            if (distanciaAtual < 10) {
                System.out.println("Está quente!");
            }else {
                System.out.println("Está ficando frio.");
            }
            
        }

        if (tentativas == tentativasMaximas){
            System.out.println("Suas tentativas acabaram, o número aleatório era: " + numeroSecreto);
        }

        ler.close();
    }
}