package heapSort;

public class Heapsort {
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
