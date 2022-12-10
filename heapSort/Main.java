package heapSort;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Array: ");
        String[] arrayEntrada = scan.nextLine().split("[ ,]+");
        //65 339 182 649 400 701 776 317 518 910 727 776 365 450 733 169 292 485 484 929 909 28 76 290 772 845 201 504 606 554 773

        int[] array = new int[arrayEntrada.length];

        for (int i = 0; i < arrayEntrada.length; i++) {
            array[i] = Integer.parseInt(arrayEntrada[i]);
        }

        System.out.println("\nArray inserido: " + Arrays.toString(array));

        heapSort(array);
        System.out.println("\nArray ordenado: " + Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            heapar(array, i, array.length - 1);
        }

        for (int i = array.length - 1; i > 0; i--) {
            trocar(array , 0 , i);
            heapar(array , 0 , i - 1);
        }
    }

    private static void heapar(int[] array, int i, int m) {
        int j;

        while (2 * i + 1 <= m) {
            j = 2 * i + 1;

            if (j < m) {
                if (array[j] < array[j + 1]) {
                    j++;
                }
            }

            if (array[i] < array[j]) {
                trocar(array, i, j);
                i = j;
            }

            else {
                i = m;
            }
        }
    }

    public static void trocar(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}