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
public class SelectionSort {

    int r, w, x;
    int aux;
    int contador = 1;

    public void algoritmoSelectionSort(int vetor[]) {

        for (r = 0; r < vetor.length - 1; r++) {
             /*Antes de comparar, considera-se como o valor no indice atual do lool,
            o valor inserido no indice que o loop esta.
            */
            aux = r;
             //O laço 'for' criado é para a comparação.Ele ira  basicamente pegar o elemento seguinte ao atual(definido pela variavel).
            for (w = aux + 1; w < vetor.length; w++) {
                 //Após ele pegar o elemento seguinte comecará aqui a comparação.
                if (vetor[w] < vetor[aux]) {
                    aux = w;
                }
            }
            //Depois é realizado a troca dos elementos.
            if (aux != r) {
                x = vetor[r];
                vetor[r] = vetor[aux];
                vetor[aux] = x;
            }
        }

        if (contador == 1) {
            System.out.println("Selection Sort");
            contador++;
        }
        System.out.print("[");
        for (r = 0; r < vetor.length; ++r) {
            System.out.print(" " + vetor[r] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        SelectionSort execute = new SelectionSort();

        int vetor1[] = {8, 4, 7, 5, 1, 6}; //Esperado -> [1, 4, 5, 6, 7, 8]
        int vetor2[] = {2, 3, 4, 6, 8, 9}; //Esperado -> [2, 3, 4, 6, 8, 9]

        execute.algoritmoSelectionSort(vetor1); 
        execute.algoritmoSelectionSort(vetor2);   
    }
}