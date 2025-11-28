public class ArrayOperations {

    static void print(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }

    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            for (int j = 0; j < a.length-i-1; j++)
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
    }

    public static void main(String[] args) {

        int[] arr = {50, 10, 40, 20, 30};

        System.out.println("Original:");
        print(arr);

        System.out.println("Search 20 → index " + linearSearch(arr, 20));

        bubbleSort(arr);
        System.out.println("Sorted:");
        print(arr);
    }
}
