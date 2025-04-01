public class QuickSort {

    private static void swap(int[] arr, int k, int l) {
        int temp = arr[k];
        arr[k] = arr[l];
        arr[l] = temp;
    }

    private static int partition(int[] arr, int i, int j) {
        int pivot = arr[j];
        int k = i - 1;
        // 10, 7, 8, 9, 1, 11
        for (int l = i; l < j; l++) {
            if (arr[l] <= pivot) {
                k++;
                swap(arr, k, l);
            }
        }
        swap(arr, k + 1, j);
        System.out.println("Pivot: " + pivot + ", k: " + k + ", i: " + i + ", j: " + j);
        return k + 1;
    }

    private static void quickSort(int[] arr, int i, int j) {
        if (i < j) {
            int pi = partition(arr, i, j);

            quickSort(arr, i, pi - 1);
            quickSort(arr, pi + 1, j);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 7, 8, 9, 1, 11 };

        quickSort(arr, 0, arr.length - 1);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

}