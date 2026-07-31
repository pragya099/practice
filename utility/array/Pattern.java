public  class Pattern{
    public static void main(String[] args){
       printPattern(5);
    }
    public static void printPattern(int n){
     int patternSize=1;
     int mid=n/2+1;
     for(int i=1;i<=n;i++){
            for(int j=1;j<=patternSize;j++){
               
                System.out.print("*");
            }
            if(i<mid){
            patternSize+=1;
            }else{
                patternSize-=1;
            }
            System.out.println(" ");
        }
    }
}