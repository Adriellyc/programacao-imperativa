package ATIVIDADE2;

public class Selectionsort {
    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        System.out.println("Vetor original:");
        mostrarVetor(vetor);

        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j; 
                }
            }

            
            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
            }
        }

        System.out.println("Vetor após ordenação:");
        mostrarVetor(vetor);
    }

    public static void mostrarVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
