public class Main {
    public static void main(String[] args) {
        int[] array = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40
        };



        long startTime = System.nanoTime(); // Record start time

        quickSort(array, 0 , array.length - 1);

        long endTime = System.nanoTime();   // Record end time
        long totalTime = endTime - startTime; // Calculate elapsed time in nanoseconds

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(",");
        }
        System.out.print("]");

        System.out.println("\nTime taken: " + totalTime + " nanoseconds");

    }

    public static void quickSort(int[] a, int s, int e) {
        if (s < e) {
            int pivot = e;
            int i = s - 1, j = s;

            while (j < pivot) {
                if (a[j] < a[pivot]) {
                    i++;
                    swap(a, i, j);
                }
                j++;
            }

            swap(a, i + 1, pivot);
            int p = i + 1;

            quickSort(a, s, p - 1);
            quickSort(a, p + 1, e);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}