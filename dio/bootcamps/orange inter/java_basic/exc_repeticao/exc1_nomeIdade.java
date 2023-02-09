import java.util.Scanner;

/*
faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo sua idade
pare o programa quando inserindo o valor 0 no campo
 */

public class exc1_nomeIdade {

    public static void main(String[] args) {

        /*  fluxo de entrada, classe scanner lê através do teclado  */
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
