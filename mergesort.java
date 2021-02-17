public class mergesort {

    /*
    * Merge sort is the process of taking an array splitting it
    * into smaller arrays then sorting the smaller arrays
    * merging them and sorting the arrays and then sorting until
    * the final array is done
    * O(nlogn)
    *
     */
    public static void main(String[] args) {
        System.out.println("Merge Sort algo");
        int arr1[] = {1, 9, 10, 7, 5, 3, 4, 6};
        int arr2[] = {2, 5, 6, 7, 3, 4, 6, 7, 10};
        int arr3[] = {14, 2, 13, 16, 19, 22, 1};
        mergeSort(arr1);
        mergeSort(arr2);
    }

    public static void mergeSort(int array[]){
        int left = 0;
        if(array.length % 2 == 1) {
             left = array.length / 2 + 1;
        }else {
             left = array.length / 2;
        }
        int right = array.length/2;

        int arrayL[] = new int[left];
        int arrayR[] = new int[right];

        for(int i=0; i<left; i++){
            arrayL[i] = array[i];
            System.out.print(arrayL[i] + " ");
        }
        for(int i=0; i<right; i++) {
            arrayR[i] = array[i + right];
            System.out.print(arrayR[i] + " ");
        }
        System.out.println("");
        checkArray(arrayL);
        checkArray(arrayR);
    }


    public static void checkArray(int array[]){
        if(array.length == 1){
            // sort it
            System.out.println(array[0]);
        }else {
            mergeSort(array);
        }
    }


}
