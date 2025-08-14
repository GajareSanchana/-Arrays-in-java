
//sort the arrays of 0's,1's,2's.(Dutch flag Algorihtm)
public class Sort012AArr {
    public static void main(String[] args) {
        int[]arr={0,1,2,2,0,2,1,2,0,0};
        int n=arr.length;
        int mid=0,hi=n-1,lo=0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=temp;
                lo++;mid++;
            }
            else if(arr[mid]==1)mid++;
            else{//arr[mid]==2)
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
