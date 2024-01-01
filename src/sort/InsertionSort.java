package sort;

public class InsertionSort {

    public int [] insertionSort(int [] A){
        for(int i = 1; i < A.length; i++){
            int lock = i - 1; //고정요소 index
            int newItem = A[i]; //새 요소
            while(lock >=0 && newItem < A[lock]){
                A[lock+1] =A[lock];
                lock --;
            }
            A[lock+1] = newItem;
        }
        return A;
    }
}
