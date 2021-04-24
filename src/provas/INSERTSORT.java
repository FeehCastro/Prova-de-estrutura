/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provas;

/**
 *
 * @author felip
 */
public class INSERTSORT {
 int k, z;
    int aux;
    int contador = 1;

    public void algoritmoInsertionSort(int vetor[]) {
  //Ira armazenar uma variavel para poder fazer as comparaçãoes a partir dela.
        //Para isso que o 'for' iniciaria a partir da segunda posição.
        for (k = 1; k < vetor.length; k++) { 
             //A variavel aux criada abaixo recebe o elemento da segunda posição.
            aux = vetor[k];
            //Agora será iniciada a comparação
            z = k - 1;
            //Isto serve para pegar todos os elementos anteriores a aux menores que ele.
            //Enquanto algum elemento anterior (determinado pela variavel z) for maior que o valor armazenada em aux.
            while ((z >= 0) && vetor[z] > aux) {
            //O elemento seguinte recebe o elemento atual da variavel z.
                vetor[z + 1] = vetor[z];
                z = z - 1;
            }
            vetor[z + 1] = aux;
        }

        if (contador == 1) {
            System.out.println("Insertion Sort");
            contador++;
        };
        System.out.print("[");
        for (k = 0; k < vetor.length; ++k) {
            System.out.print(" " + vetor[k] + " ");
        }
        System.out.println("]; ");
    }

    public static void main(String[] args) {

        INSERTSORT execute = new INSERTSORT();

        int vetor1[] = {5, 7, 8, 3, 1}; //Esperado -> [1, 3, 5, 7,8]
        int vetor2[] = {2, 6, 1, 4, 10}; //Esperado -> [1, 2, 4, 6, 10] 

        execute.algoritmoInsertionSort(vetor1); 
        execute.algoritmoInsertionSort(vetor2); 
    }
}
    

