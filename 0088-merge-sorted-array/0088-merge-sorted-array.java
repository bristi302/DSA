class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
     int r1 = m -1;
     int r2 = b.length-1;
     int w = m + n-1;
     while(w >= 0){
        if(r1 >= 0 && r2 >= 0){
            a[w] = a[r1] > b[r2] ? a[r1--] : b[r2--];
        }else if(r1 >=0){
            a[w] = a[r1--];
        }else{
            a[w] = b[r2--];
        }
        w--;
      }
      return;

    }
}