import java.util.Scanner;
/*
faça um programa que peça uma nota, entre 0 e 10
mostre a mensagem caso o valor seja invalido
e continue pedindo ate q o user informe valor válido
 */

public class exc2_nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("nota: ");
        nota = scan.nextInt();

        /* enquanto nota for menor que 0 OU nota maior que 10 */
        while(nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Tente novamente: ");
            nota = scan.nextInt();
        }
    }
}
