/* faça um programa que leia 5 numeros
e informe o maior e a media desses numeros */

import java.util.Scanner;
public class exc3_maiorEMedia {
    public static void main(String[] args) {

        /* metodo scanner para digitar */
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0 ;

        /* do = faça   while = enquanto */
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            count = count + 1 ;

            if (numero > maior) maior = numero;



        } while (count < 5);

        System.out.println("Média: " + (soma/5));
        System.out.println("Maior: "+ maior);
    }

}
