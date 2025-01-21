package Array;

public class TrappedRainWater {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }

    public static int trappedRainwater(int height[]){
        int n=height.length;
        int sum=0;

        //calculating left boundary
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculating right boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //calculating trapped rainwater
        for(int i=0;i<n;i++){
            sum=sum+(Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        return sum;
    }
}
