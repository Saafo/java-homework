import java.io.*;
import java.util.Arrays;

public class MergeSort {
    public static void merge_sort(int l, int r, int[] a) {
        if (l != r) {
            int mid = (l + r) / 2;
            merge_sort(l, mid, a);
            merge_sort(mid + 1, r, a);
            merge(l, r, mid, a);
        } else return;
    }
    
    public static void merge(int l, int r, int mid, int[] a) {
        int[] la = new int[mid - l + 1];
        int[] ra = new int[r - mid];
        for (int i = l; i < mid + 1; i++)
            la[i - l] = a[i];
        for (int i = mid + 1; i < r + 1; i++) {
            ra[i - mid - 1] = a[i];
        }
        int k = l, i = 0, j = 0;
        while (k <= r && i < la.length && j < ra.length) {
            if (la[i] <= ra[j]) {
                a[k++] = la[i++];
            } else {
                a[k++] = ra[j++];
            }
        }
        while (i < la.length) a[k++] = la[i++];
        while (j < ra.length) a[k++] = ra[j++];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String RawString[] = bufferedReader.readLine().split(",");
        int[] a = new int[RawString.length];
        for(int i = 0;i < RawString.length;i++){
            a[i] = Integer.valueOf(RawString[i]);
        }
        int[] acopy = new int[RawString.length];
        System.arraycopy(a, 0, acopy, 0, RawString.length);

        long StartTime = System.nanoTime();
        merge_sort(0, RawString.length - 1, a);
        long EndTime = System.nanoTime();

        for(int i = 0;i < RawString.length;i++){
            System.out.print(a[i]);
            if(i == RawString.length - 1)
                System.out.print("\n");
            else
                System.out.print(",");
        }
        System.out.println("Merge sort time used: " + String.valueOf(EndTime - StartTime) + " ns.\n");

        long AStartTime = System.nanoTime();
        Arrays.sort(acopy);
        long AEndTime = System.nanoTime();
        for(int i = 0;i < RawString.length;i++){
            System.out.print(acopy[i]);
            if(i == RawString.length - 1)
                System.out.print("\n");
            else
                System.out.print(",");
        }
        System.out.println("Arrays.sort() time used: " + String.valueOf(AEndTime - AStartTime) + " ns.\n");
    }
}