// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main4 {
    public static void main(String[] args) {
       int [] arr = {12,32,13,23,14,15,42};
       reverse(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
           arr[j]=temp;
            i++;
            j--;
        }
         
    }
}