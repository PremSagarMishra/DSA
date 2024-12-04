package Array;



//using prefix sum algorithm
public class MaxSubarraySumII {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int prefixarray[]=new int[arr.length];

        prefixarray[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefixarray[i]=prefixarray[i-1]+arr[i];
        }
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int start=0 ; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                currsum= start==0 ? prefixarray[end]:prefixarray[end]-prefixarray[start-1];

                maxsum=Math.max(maxsum,currsum);
            }
        }

        System.out.println("Max sum = "+maxsum);
    }
}
