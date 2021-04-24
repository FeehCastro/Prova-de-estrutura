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
public class QuickSort {
/**
   * Método para a ordenação de um vetor de inteiros.
   * @param vetor - Vetor de inteiros que sera ordenado.
   */
    public void algoritmoQuickSort(int vetor[]) {
        quickSort(vetor, 0, vetor.length - 1);

    }

    private void quickSort(int[] vetor, int inicio, int fim) {
/**
   * Este é o método que irá chamar a divisão do vetor nos três vetores do conceito.
   * O vetor do meio esta sendo interpretado apenas como o elemento
   * pivô retornado pelo método dividir.
   *
   * vetor - Vetor de inteiros que passara pelo Quick Sort.
   * inicio - Indice inicial do vetor que sera considerado no Quick Sort.
   * fim - Indice final do vetor que sera considerado no Quick Sort.
   */
        if (fim > inicio) {
//Aqui ele ira chamar a rotina que vai dividir o vetor em 3 partes.
            int indexPivo = dividir(vetor, inicio, fim);
/* Chamada recursiva para redividir novamente o vetor de elementos menores
        que o pivô. */
            quickSort(vetor, inicio, indexPivo - 1);
/* Chamada recursiva para redividir o vetor de elementos maiores
        que o pivô. */
            quickSort(vetor, indexPivo + 1, fim);
        }

    }

 /**
   * Método que ira dividir o vetor e encontrar o indice do pivô.
   * vetor - Vetor de inteiros
   * inicio - Indice inicial do vetor.
   * fim - Indice final do vetor.
   * return - O indice do pivo.
   */
        private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        /* Aqui ele terá a função de fazer o vetor chegar ate que ultrapasse o outro ponteiro
        ou ate que o elemento em questão seja menor que o pivô. */
        while (pontEsq <= pontDir) {

           /* Aqui ele vai correr o vetor ate que ultrapasse o outro ponteiro
        que o elemento em questão seja maior que o pivô. */
           while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

           /* Se os ponteiros ainda não tenham se cruzado, significa que valores
        menores e maiores que o pivô foram localizados em ambos os lados.
        Trocar estes elementos de lado. */
           while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }
        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    /**
   * Método para trocar dois elementos de um vetor.
   *
   * vetor - Vetor de inteiros que tera seus elementos trocados.
   *  f - Indice do elemento que sera trocado.
   *  b - Indice do elemento que sera trocado.
   */
        private void trocar(int[] vetor, int f, int b) {
        int temp = vetor[f];
        vetor[f] = vetor[b];
        vetor[b] = temp;
    }

    private static void imprimirVetor(int[] vetor) {
        System.out.print("QuickSort\n");
        System.out.print("[");
        for (int num = 0; num < vetor.length; ++num) {
            System.out.print(" " + vetor[num] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        QuickSort execute = new QuickSort();

        int vetor1[] = {3, 7, 4, 1, 10, 5, 6}; //Esperado -> [1, 3, 4, 5, 6, 7, 10]
        int vetor2[] = {2, 11, 6, 4, 1, 8, 7}; //Esperado -> [1, 2, 4, 6, 7, 8, 11]

        execute.algoritmoQuickSort(vetor1); 
        execute.algoritmoQuickSort(vetor2);   
        imprimirVetor(vetor1);
        imprimirVetor(vetor2);

    }
}
