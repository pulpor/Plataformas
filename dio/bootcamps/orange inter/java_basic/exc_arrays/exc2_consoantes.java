
/*
faça um programa que leia um vetor de 6 caracteres
e diga quantas consoantes foram lidas, imprima-o.
 */

import java.util.Scanner;

public class exc2_consoantes {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String [6];
        int quant = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase ("a") |
                    letra.equalsIgnoreCase( "e") |
                    letra.equalsIgnoreCase( "i") |
                    letra.equalsIgnoreCase( "o") |
                    letra.equalsIgnoreCase( "u") ) ) {
                consoantes[count] = letra;
                quant++ ;
            }

            count++;

        } while(count < consoantes.length );

        System.out.print("consoantes: \n");
        for ( String consoante : consoantes ) {
            if ( consoante != null)
            System.out.print(consoante + " ");
        }

    }

}
