public class exc1_ordemInversa {

/*
crie um vetor de 6 numeros inteiros
e mostre-os na ordem inversa
 */

    public static void main(String[] args) {

        int [] vetor = {-5,0,15,50,8,4};

        //System.out.println(vetor.length);
        System.out.println("vetor: ");
        int count = 0;

        while (count < (vetor.length)){    /*enquanto contador menor que tamanho do vetor */
            System.out.print(vetor[count] + " ");  /* imprima vetor na posição do contador */
            count++;  /* contador = ele mesmo mais um  */
        }

        System.out.println("\nvetor inverso: ");
        for (int i = (vetor.length -1); i >= 0 ; i--){
            System.out.print(vetor[i] + " "); };
    }


}
