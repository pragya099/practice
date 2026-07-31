class Main2 {
    public static void main(String[] args) {
     int [] arr={21,23,34,22,89,45};
      int[] prr = new int[arr.length];
     swap(arr,prr);
     
    }
    public static void swap(int [] arr , int [] prr){
   int j=0;
       for(int i = arr.length-1;i>=0;i--){
           prr[j]=arr[i];
           j++;
       }
       for( j=0;j<prr.length;j++){
           System.out.print(prr[j]+", ");
       }
    }
}