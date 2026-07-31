public class Dsa12 {
    public static void main(String[] args){
        System.out.println("hello");
        printPattern(6);
    }
    public static void printPattern(int n){
     int patternSize=n;
     for(int i=1;i<=n;i++){
            for(int j=1;j<=patternSize;j++){
               
                System.out.print("*");
            }
            patternSize-=1;
            System.out.println(" ");
        }
    }
    
}
