

//gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9

import java.util.Random;

public class exc4_arrayMultidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int i=0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){   // eixo j é coluna
                M[i][j] = random.nextInt(9);  //até 9, bound é limitador
            }

        }

        System.out.println("Matriz: ");
        for (int[] linha: M) {
            for (int coluna: linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();  // faz os 4 e pula linha
        }

    }


}
