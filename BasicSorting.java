public class BasicSorting {
    public static void bubbleSort(int arr[]){
        for(int turn= 0; turn<arr.length-1; turn++){
            int swaps = 0;
            for(int j=0 ; j<arr.length-1-turn; j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }





    //selectionSort method
    public static void selectionSort (int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;

            for(int j =i+1; j<arr.length; j++){
                if (arr[minPos]<arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }



    //insertionSort method
    public static void insertionSort(int arr[]){
        for(int i = 1; i< arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correctpos to insert
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]= curr;
        }
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}
