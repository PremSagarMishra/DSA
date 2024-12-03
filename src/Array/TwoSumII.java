package Array;

public class TwoSumII {

    //leetcode problem no 167
    public static void main(String[] args) {
        int arr[]={5,25,75};
        int target=100;
        int[] result=twoSum2(arr,target);
        System.out.println(result[0]+","+result[1]);
    }

    //time limit exceeded for this method
    public static int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int res[]=new int[2];
        int start=0,end=numbers.length-1;

        while(start<end){

            if(numbers[start]+numbers[end]==target){
                res[0]=start+1;
                res[1]=end+1;
                break;
            }
            end--;
            if(end==start){
                start++;
                end=numbers.length-1;
            }
        }

        return res;
    }


    //better solution checking if sum is greater than target end is decreasing
    //and if sum is less than target start is increasing
    public static int[] twoSum2(int[] numbers, int target) {
        int sum=0;
        int res[]=new int[2];
        int start=0,end=numbers.length-1;

        while(start<end){
            sum=numbers[start]+numbers[end];
            if(sum==target){
                res[0]=start+1;
                res[1]=end+1;
                break;
            }

            if(sum>target)
                end--;
            else if(sum<target)
                start++;

        }
        return res;
    }
}
