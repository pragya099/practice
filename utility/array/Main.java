class Main {
    public static void main(String[] args) {
     int [] arr={21,23,34,22,89,45};
     swap(arr);
     
    }
    public static void swap(int [] arr){
   
       for(int i = arr.length-1;i>=0;i--){
           System.out.print(arr[i]+", ");
       }
    }
}