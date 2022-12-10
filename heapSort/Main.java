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

        Heapsort.heapSort(array);
        System.out.println("\nArray ordenado: " + Arrays.toString(array));
    }
}