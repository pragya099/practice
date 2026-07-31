public class Pattern2 {

    public static void main(String[] args) {
        printPattern(7);   // Try 5, 6, or 7
    }

    public static void printPattern(int n) {

        int mid = n / 2 + 1;
        int patternSize = mid;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= patternSize; j++) {
                System.out.print("* ");
            }
            System.out.println();

            // Decrease till middle row
            if (i < mid) {
                patternSize--;
            }
            // Increase after middle row
            else {
                patternSize++;
            }
        }
    }
}

// public class Pattern2{
//     public static void main(String[] args){
// printPattern(6);
//     }
//     public static void printPattern(int n){
//         int mid=n/2+1;
//      int patternSize=mid;
//      for(int i=1;i<=n;i++){
//             for(int j=1;j<=patternSize;j++){
               
//                 System.out.print("*");
//             }
//             if(patternSize<mid){
//                 patternSize-=1;
//             }
//             else{
//             patternSize+=1;
//             }
//             System.out.println(" ");
//         }
//     }
// }