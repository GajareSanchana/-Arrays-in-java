//Merge two sorted arrray in one single array

public class Merge2SortArr {
    public static void main(String[] args) {
        int[] a={11,33,42,71};
        int[] b={26,54,69,81};
        int m=a.length, n=b.length;
        int[] c=new int[m+n];
        int i=0,j=0,k=0;
        //merging
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){//now take elements from b only
            while(j<b.length){
                c[k]=b[j];
                j++; k++;
            }

        }
         if(i==a.length){//now take elements from a only
            while(j<a.length){
                c[k]=a[j];
                i++; k++;
            }

        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
