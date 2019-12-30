import java.util.*;
import java.util.concurrent.CountDownLatch;

public class QuadMerge extends Thread{

    private static void Merge(int[] l,int[] r,int[] res){
        int i=0;
        int j=0;
        int k=0;
        while(i<l.length&&j<r.length){
            if(l[i]<=r[j]){
                res[k] = l[i];
                i++;
            }else{
                res[k] = r[j];
                j++;
            }
            k++;
        }
        if(i==l.length){
            for(;j<r.length;j++){
                res[k] = r[j];
                k++;
            }
        }else{
            for(;i<l.length;i++){
              res[k] = l[i];
              k++;
            }
        }
    }

    private static void normalMergeSort(int a[]){
        if(a.length>1){
            int[] l = Arrays.copyOfRange(a,0,a.length/2);
            int[] r = Arrays.copyOfRange(a,a.length/2,a.length);
            normalMergeSort(l);
            normalMergeSort(r);
            Merge(l,r,a);
        }
    }

    private static void multiMergeSort(int a[]){
        if(a.length>3){
            int[] m1 = Arrays.copyOfRange(a,0,a.length/4);
            int[] m2 = Arrays.copyOfRange(a,a.length/4,a.length/2);
            int[] m3 = Arrays.copyOfRange(a,a.length/2,a.length*3/4);
            int[] m4 = Arrays.copyOfRange(a,a.length*3/4,a.length);
            int[] a1 = new int[a.length/2];
            int[] a2 = new int[a.length/2];
            CountDownLatch latch = new CountDownLatch(4);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    normalMergeSort(m1);
                    latch.countDown();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    normalMergeSort(m2);
                    latch.countDown();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    normalMergeSort(m3);
                    latch.countDown();
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    normalMergeSort(m4);
                    latch.countDown();
                }
            }).start();


            try{
                latch.await();
            }catch (Exception ex){
                ex.printStackTrace();
            }

            CountDownLatch latch2 = new CountDownLatch(2);
            new Thread(new Runnable(){
            
                @Override
                public void run() {
                    Merge(m1,m2,a1);
                    latch2.countDown();
                }
            }).start();
            new Thread(new Runnable(){
            
                @Override
                public void run() {
                    Merge(m3,m4,a2);
                    latch2.countDown();
                }
            }).start();
            try{
                latch2.await();
            }catch (Exception ex){
                ex.printStackTrace();
            }

            Merge(a1,a2,a);
        }
    }

    public static void main(String[] args){
        int length = 100000000;
        int[] a = new int[length];

        for(int i=0;i<length;i++){
            a[i] = (int) (Math.random()*100000000);
        }

        int b[] = a;
        long time1 = System.currentTimeMillis();
        normalMergeSort(b);
        long time2 = System.currentTimeMillis();
        System.out.println("The cost of the normal merge sort is "+(time2-time1));

        int c[] = a;
        long time3 = System.currentTimeMillis();
        multiMergeSort(c);
        long time4 = System.currentTimeMillis();
        System.out.println("The cost of the quadra-threads merge sort is "+(time4-time3));
        // for(int item : c) {
        //     System.out.print(item+" ");
        // }

    }

}