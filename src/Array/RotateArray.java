package Array;
//leetcode problem - 189. Rotate Array
public class RotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;

    }
    public static void rotate(int[] nums, int k) {
        int length=nums.length;
        if(k>length){   //checking rotation time is greater than the length of the array
            k=k%length;     //mod will give the  exact no of time we need to roate the array
                            //if length of array is less than rotation time
        }

        //we will rotate the array part by part
        rotateArray(length-k,length-1,nums); //first we will rotate the array part from length-k to last element
        rotateArray(0,length-k-1,nums);      //second we will rotate the array part from first element to length-k-1
        rotateArray(0,length-1,nums);       //last we will rotate the complete array
    }

    public static void rotateArray(int start,int end ,int[] arr){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
}
