
import java.util.Scanner;
public class  Arrays2{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays2 obj = new Arrays2();
            obj.display(arr);
             sc.close();
             obj.swap(arr, 0, n-1);
        }
    }
    public void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"-> ");
        }
        System.out.println();
    }
    public void swap(int[] arr,int a,int b){
       a=2;
      b=4;
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(arr[b]);
    }

}