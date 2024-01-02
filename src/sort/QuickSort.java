package sort;

public class QuickSort {

    public  int [] A;

    public QuickSort() {
    }

    public QuickSort(int[] a) {
        this.A = a;
    }

    public int[] getA() {
        return A;
    }


    public void setA(int[] a) {
        this.A = a;
    }

    public int [] quickSort(int [] a,int p, int r){
        QuickSort qs = new QuickSort(a);
        int [] A = qs.getA();
        int q = 0;

        //재귀적 호출시
        //시작 index와 마지막 index가 같다는것은
        // 정렬대상의 원소가 하나 뿐이라는 것으로
        // 더이상 정렬할 필요가 없기 때문에 재귀적 호출을 멈춘다.
        // 다시 말해 마직막 index가 시작의 index보다 커야 정렬의
        // 대상이 된다는 것이다.
        if(p < r){
            q = qs.partition(qs,p,r);
            qs.quickSort(A,p,q-1);
            qs.quickSort(A,q+1,r);
        }

        return A;
    }

    public int  partition(QuickSort qs,int p, int r) {
        int [] A = qs.getA();
        int x = A[r];
        int i = p-1;        //i는 1구역의 끝지점
        // j은 3구역의 시작 지점
        for (int j = p; j <= r-1; j++) {
            if (A[j] <= x){
                i++;
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }

        A[r] = A[i+1];
        A[i+1] = x;

       return  i+1;
    }
}
