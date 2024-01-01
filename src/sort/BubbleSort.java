package sort;

public class BubbleSort {
    public int [] bubbleSort(int []A){
        int temp = 0;
        int n = A.length;
        for(int i = 0; i < A.length; i++ ){
            for(int j = 1; j < n; j++){
                if(A[j-1] > A[j] ){
                   temp = A[j-1];
                   A[j-1] = A[j];
                   A[j] = temp;
                }
                if(j == n-1) n--;
            }
        }

        return  A;
    }

    public int [] bubbleSortAndCheckSorted(int [] A){
        int temp = 0;
        int n = A.length;
        for(int i = 0; i < A.length; i++ ){
                boolean sorted = true;
            for(int j = 1; j < n; j++){
                if(A[j-1] > A[j] ){
                    sorted = false;
                    temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
                if(j == n-1) n--;
                if(sorted) {
                    System.out.println("sorted 는 "+ (i+1) +" 번 째 확인했을 때 "+ sorted + " 이다.");
                    return A;
                }
            }
        }

        return  A;
    }

}
