package Array;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};

        int maxsum=0;
        int currsum=0;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum=currsum+arr[k];
                }
                maxsum=Math.max(currsum,maxsum);

            }
        }

        System.out.println("Max sub arraysum is "+maxsum);
    }
}
