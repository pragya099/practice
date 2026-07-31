class Pattern3{
    public static void main(String args[]){
patternSize(10);
    }
    public static void patternSize(int n){
        int space=n-1;
    int size=1;
    for(int i=1;i<n;i++){
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=size;j++){
            System.out.print(" *");
        }
         
        space--;
        size++;
        System.out.println("");
    
    }
  
    }
}
/*
        *
     *  *
   *  * *
*  *  * *
//////////////////////////
*******
 ******
  *****
   ****
    ***
     **
      * #space=0 patternSize =n
///////////////////////////////
        * 
       * *
     * * * *
 space-1
 size+=2
 /////////////////////////////////////
     *
   *   * 
  *      *
  **********
*/