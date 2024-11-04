package ATIVIDADE2;

public class SelectionSort {
    public static void main(String[] args) {
        // Esse é o vetor que vamos ordenar
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        // Vamos mostrar o vetor original
        System.out.println("Vetor original:");
        mostrarVetor(vetor);

        // Agora, vamos ordenar o vetor com o Selection Sort
        for (int i = 0; i < vetor.length - 1; i++) {
            // Aqui, vamos assumir que o maior número está na posição 'i'
            int maxIndex = i; // Altera o nome para maxIndex

            // Vamos procurar o maior número no restante do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[maxIndex]) { // Altera a condição para buscar o maior
                    maxIndex = j; // Atualiza o índice do maior número
                }
            }

            // Se encontramos um número maior, trocamos
            if (maxIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[maxIndex];
                vetor[maxIndex] = temp;
            }
        }

        // Por fim, mostramos o vetor ordenado
        System.out.println("Vetor após ordenação:");
        mostrarVetor(vetor);
    }

    // Método para mostrar o vetor
    public static void mostrarVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nova linha
    }
}
