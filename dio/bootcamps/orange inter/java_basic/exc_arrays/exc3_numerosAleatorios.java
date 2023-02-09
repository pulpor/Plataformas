
/* faça um programa q leia 20 numeros inteiros aleatorios
armezene-os e ao final mostre os numeros e seus sucessores.
*/


import java.util.Random;

public class exc3_numerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random();
        int [] aleatorios  = new int[20];  //guardar os numeros aleatorios

        // usar o length quer dizer o tamanho total da var.
        for (int i = 0; i < aleatorios.length; i++) {

            int numero = random.nextInt(100); // bound é limite
            aleatorios[i] = numero;
        }

        System.out.println("numeros aleatorios");
        for (int numero : aleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nnumeros sucessores:");
        for (int numero : aleatorios) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nnumeros antecessores:");
        for (int numero : aleatorios) {
            System.out.print((numero-1) + " ");
        }


    }


}
