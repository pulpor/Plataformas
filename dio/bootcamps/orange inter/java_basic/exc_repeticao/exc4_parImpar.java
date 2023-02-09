

/*
faça um programa que peça N numeros inteiros,
calcule e mostre a quantidade de numeros pares e impares
 */

import java.util.Scanner;
public class exc4_parImpar {

    public static void main(String[] args) {
        /*
        metodo scanner (scaneia o teclado
        posto na variavel 'scan' que é igual a
        novo Scanner do systema
         */
        Scanner scan= new Scanner(System.in);

        int quantidade ;
        int numero;
        int pares = 0, impares = 0 ;

        System.out.println("quantidade de numeros: ");
        quantidade = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares ++;  /*  '%'  resto da divisão */
            else impares++;

            count++ ;   /* count = count + 1 */
        } while( count < quantidade );


        System.out.println(" Pares: "+ pares);
        System.out.println(" Impares: "+ impares);
    }

}
