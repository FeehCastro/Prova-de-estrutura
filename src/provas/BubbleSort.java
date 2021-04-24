package PROVAS;

public class BubbleSort {

    int m, p;
    int aux;
    int contador = 1;

    public void algoritmoBubbleSort(int vetor[]) {

        // este 'for' abaixo tem a função de controlar a quantidade de vezes que o vetor será ordenado.
        for (p = 0; p < vetor.length; ++p) {
        // este outro 'for' é utilizado para ordenar o vetor.
            for (m = 0; m < (vetor.length - 1); ++m) {
            /* Se o valor da posição atual do vetor for maior que o proximo valor,
            então trocamos os valores de lugar no vetor. */
                if (vetor[m] > vetor[m + 1]) {
                    aux = vetor[m];
                    vetor[m] = vetor[m + 1];
                    vetor[m + 1] = aux;
                }
            }
        }

        if (contador == 1) {
            System.out.println("Bubble Sort");
            contador++;
        };
        System.out.print("[");
        for (p = 0; p < vetor.length; ++p) {
            System.out.print(" " + vetor[p] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        BubbleSort execute = new BubbleSort();

        int vetor1[] = {4, 8, 1, 3, 2};
        int vetor2[] = {7, 3, 9, 1, 8};

        execute.algoritmoBubbleSort(vetor1); //Esperado -> [1, 2, 3, 4, 8]
        execute.algoritmoBubbleSort(vetor2); //Esperado -> [1, 3, 7, 8, 9]
    }

}
