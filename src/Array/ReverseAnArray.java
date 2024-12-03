package Array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int f=0,l=a.length-1;

        while(f<l){
            int temp=a[f];
            a[f]=a[l];
            a[l]=temp;

            f++;
            l--;
        }
        System.out.println("Reversed array");
        for(int n:a){
            System.out.print(" "+n);
        }
    }
}
