package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=12;
        int start=0,end=arr.length-1;
        int mid=(start+end)/2;
        while(start<end){
            mid=(start+end)/2;

            if(arr[mid]==key){
                System.out.println("Found at position "+(mid+1));
                return;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
        }

        System.out.println("Not Found");
    }
}
