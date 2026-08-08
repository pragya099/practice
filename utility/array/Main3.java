
import java.util.Scanner;
class Main3 {
    public static void main(String[] args) {
    
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int k;
       int [] arr= new int[n];
       for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
       }
       leadCode(arr,3);
       
    }
    public static void leadCode(int [] arr, int k ){
        for(int i=k;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}