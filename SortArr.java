//Sort Zeros and Ones => two pass solution
public class SortArr {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,0,0,0,1,0};
        int n=arr.length;
        int noOfZeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) noOfZeroes++;
        }
        System.out.println("Number of zeroes: " + noOfZeroes);

        for(int i=0;i<noOfZeroes;i++){
            arr[i]=0;

        }
        for(int i=noOfZeroes;i<n;i++){
            arr[i]=1;
        }
         System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
