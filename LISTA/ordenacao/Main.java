public class Main{
    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        // Exibe o vetor original
        System.out.println("Vetor original:");
        exibirVetor(vetor);

        // Ordena o vetor usando Selection Sort
        selectionSort(vetor);

        // Exibe o vetor ordenado
        System.out.println("\nVetor ordenado:");
        exibirVetor(vetor);
    }

    public static void selectionSort(int[] vetor) {
        // Percorre o vetor inteiro
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceDoMenor = i; // Assume que o menor é o primeiro elemento da parte não ordenada

            // Procura pelo menor elemento no restante do vetor
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceDoMenor]) {
                    indiceDoMenor = j; // Atualiza o índice do menor valor
                }
            }

            // Troca o elemento atual com o menor encontrado
            int temp = vetor[i];
            vetor[i] = vetor[indiceDoMenor];
            vetor[indiceDoMenor] = temp;
        }
    }

    public static void exibirVetor(int[] vetor) {
        // Exibe cada elemento do vetor com um espaço
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(); // Pula uma linha no final
    }
}

