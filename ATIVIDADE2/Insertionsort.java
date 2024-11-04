package ATIVIDADE2;

public class Insertionsort {
    public static void main(String[] args) {
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};

        System.out.println("Vetor original:");
        mostrarVetor(vetor);

        insertionSort(vetor);

        System.out.println("Vetor após ordenação:");
        mostrarVetor(vetor);
    }
    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int chave = vetor[i]; 
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    
    public static void mostrarVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
