public class bubblesort {

    public static void main(String[] args) {
        int arr1[] = {1, 9, 10, 7, 5, 3, 4, 6};
        int arr2[] = {2, 5, 6, 7, 3, 4, 6, 7, 10};
        int arr3[] = {14, 2, 13, 16, 19, 22, 1};


        System.out.println("Bubble sorting algorithm on Java algo");
        bubbleSort(arr1);
        printArray(arr1);
        System.out.println("");
        bubbleSort(arr2);
        printArray(arr2);
        System.out.println("");
        bubbleSort(arr3);
        printArray(arr3);
        System.out.println("");
        System.out.println("End of program");
    }


    public static void bubbleSort(int[] array) {
        int x = array.length;
        int temp = 0;

        for(int i = 0; i < x; i++) {
            for(int j=1; j < (x-i); j++) {
                if(array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


    }
}