package sort;

import java.util.Arrays;

public class MergeSort {

    public int [] mergeSort(int [] A, int p, int r){
        MergeSort ms = new MergeSort();

        int q = (int)Math.floor((p+r)/2);

        if((r-p) == 1) {
            int min = Math.min(A[p],A[r]);
            int max = Math.max(A[p],A[r]);
            A[p] = min;
            A[r] = max;
            return A;
        }
        if(r==p) return A;


        A = ms.mergeSort(A,p,q);
        A = ms.mergeSort(A,q+1,r);
        A = ms.merge(A,p,q,r);

        return A;
    }

    private int [] merge(int [] A, int p, int q, int r){
        int i = p; int j = q+1; int t = 0;

        int [] temp = new int[(r-p)+1];

        while (i <= q && j <= r){
            if(A[i] <= A[j]) {
                temp[t] = A[i];
                i++;
            }else{
                temp[t] = A[j];
                j++;
            }
            t++;
        }

        //왼쪽 부분 배열이 남은 경우
        while(i <= q){
            temp[t] = A[i];
            t++;
            i++;
        }

        //오른쪽 부분 배열이 남은 경우
        while (j <= r){
            temp[t] = A[j];
            t++;
            j++;
        }

       i = p; t = 0;
       while (i <= r){
           A[i] = temp[t];
           t++;
           i++;
       }

        return A;
    }
}
