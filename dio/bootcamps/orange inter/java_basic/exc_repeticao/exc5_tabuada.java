/*
desenvolva um gerador de tabuada,
capaz de gerar a tabuada entre1 e 10
o user informa qual numero ele deseja vez
 */


import java.util.Scanner;
public class exc5_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de "+ tabuada);

        for ( int i = 1; i <= 10 ; i++ ) {

            System.out.println( tabuada + " x " + i + " = " + (tabuada*i));  /* até o contador ser menor ou igual a dez */

        }


    }



}
