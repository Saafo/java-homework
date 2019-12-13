public class ThreadSort {
    public static void main(String[] args) {
        int length = 10000;
        int[] data = (new Data(length)).getData();
        printArr(data);
        System.out.println();
        long StartTime = System.nanoTime();
        mergeSort(data);
        long EndTime = System.nanoTime();
        printArr(data);
        System.out.println("\nMulti-Thread Merge sort time used: " + String.valueOf(EndTime - StartTime) + " ns.\n");
    }
 
    //递归
    private static void mergeSort(int[] nums,int[] tmp,int left,int right){
        if(left<right){
            int center = (left+right)/2;
            mergeSort(nums,tmp,left,center);
            mergeSort(nums,tmp,center+1,right);
            merge(nums,tmp,left,center+1,right);
        }
    }
 
    //合并
    private static void merge(int[] nums,int[] tmp,int leftPos, int rightPos, int rightEnd){
        int leftEnd = rightPos-1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
    
        while(leftPos<=leftEnd&&rightPos<=rightEnd){
            if(nums[leftPos]<nums[rightPos])
                tmp[tmpPos++]=nums[leftPos++];
            else 
                tmp[tmpPos++]=nums[rightPos++];
        }
        while(leftPos<=leftEnd)
            tmp[tmpPos++]=nums[leftPos++];
        
        while(rightPos<=rightEnd)
            tmp[tmpPos++]=nums[rightPos++];
    
        for(int i = 0;i<numElements;i++,rightEnd--)
            nums[rightEnd]=tmp[rightEnd];
    }
    public static void mergeSort(int[] nums){
        int[] tmp = new int[nums.length];
        mergeSort(nums,tmp,0,nums.length-1);
    }
    
    //打印
    public static void printArr(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
 
 
}


//2132,3523,564,23434,74,213247,343,7453,32534,978,234,89,26,68,235,87856,353,878,3535,878,355,8783,5579,42,455787,852,4578,45,45,89,54545,9,5,36,9,7,546,90796,7467,6799,656,789,7,2345,678,765432,3456,78,76543,2