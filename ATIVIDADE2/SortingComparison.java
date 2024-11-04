package ATIVIDADE2;

import java.util.Random;

public class SortingComparison {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};

        for (int size : sizes) {
            int[] vetorSelection = generateRandomArray(size);
            int[] vetorInsertion = vetorSelection.clone();

            long startTime, endTime;

            // Selection Sort
            startTime = System.nanoTime();
            selectionSort(vetorSelection);
            endTime = System.nanoTime();
            System.out.println("Selection Sort com " + size + " elementos: " + (endTime - startTime) + " ns");

            // Insertion Sort
            startTime = System.nanoTime();
            insertionSort(vetorInsertion);
            endTime = System.nanoTime();
            System.out.println("Insertion Sort com " + size + " elementos: " + (endTime - startTime) + " ns");
        }
    }

    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[minIndex];
            vetor[minIndex] = temp;
        }
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

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
}
