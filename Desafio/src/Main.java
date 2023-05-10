import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);
        System.out.println("\n--------BEM VINDO AO JOGO DOS DADOS!--------");

        int escolha, pontos = 0, rodada = 0, total = 0;
        List<String> pontuacaoGeral = new ArrayList<>();

        while (true) {

            System.out.println("\nDigite 1 para jogar uma rodada: ");
            System.out.println("Digite 2 para saber o placar completo: ");
            System.out.println("Digite 3 para sair :");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    while (true) {
                        rodada++;
                        System.out.println("Digite um número do dado de 6 lados: ");
                        escolha = ler.nextInt();
                        if (escolha < 1 || escolha > 6) {
                            System.out.println("Não há esse lado no dado! ");
                        } else {
                            break;
                        }
                    }
                    int aleatorio = gerador.nextInt(1, 7);
                    System.out.println("Dado: "+aleatorio);


                    if (escolha == aleatorio) {
                        pontos = pontos + 10;
                        System.out.println("\nVocê acertou!!! Ganhou 10 pontos! \n");
                        pontuacaoGeral.add("Rodada: " + rodada + "; Escolha: " + escolha + "; Dado : " + aleatorio + "; Pontos: 10");

                    } else if (aleatorio == (escolha + 1) || aleatorio == (escolha - 1)) {
                        pontos = pontos + 5;
                        System.out.println("\nVocê quase acertou... Ganhou 5 pontos! \n");
                        pontuacaoGeral.add("Rodada: " + rodada + "; Escolha: " + escolha + "; Dado : " + aleatorio + "; Pontos: 5");

                    } else {
                        System.out.println("\nVocê errou :( Não ganhou nenhum ponto. \n");
                        pontuacaoGeral.add("Rodada: " + rodada + "; Escolha: " + escolha + "; Dado : " + aleatorio + "; Pontos: 0");

                    }
                    System.out.println("Até agora você tem "+pontos+" pontos.");
                    break;
                case 2:
                    System.out.println("-----PLACAR COMPLETO-----");
                    for (int i = 0; i < pontuacaoGeral.size(); i++) {
                        System.out.println(pontuacaoGeral.get(i));
                    }
                    System.out.println("TOTAL = "+pontos);
                    System.out.println("-------------------------");


                    break;
                case 3:
                    System.out.println("Obrigado por jogar!");
                    break;
                default:
                    System.out.println("\nNão existe essa opção. Tente novamente! ");

            }
            if (opcao == 3) {
                break;
            }

        }
    }
}