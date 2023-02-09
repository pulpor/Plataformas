
/*
faça um programa q calcule ofatorial de um numero inteiro
fornecido pelo usuario
exemplo: 5!= 120 ( 5 * 4 * 3 * 2 * 1 = 120 )
 */

import java.util.Scanner;
public class exc6_fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        int multi = 1;

        System.out.print(fatorial +"! = ");
        for( int i = fatorial; i>=1; i--) { /* contador = contador - 1 */
        multi = multi * i;
        }
        System.out.println(multi);
    }


}
