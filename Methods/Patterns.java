// * * *
// * * *
// * * *

// * * *
// * *
// *

// * 
// * * 
// * * *

// *           *
//    *     * 
//       * 
//    *     * 
// *           *

//       *
//       *
// *  *  *  *  *
//       *
//       *

// *     *     *
//    *  *  * 
// *  *  *  *  *
//    *  *  * 
// *     *     *

// hollow square


//     *
//   * *
// * * *

// * * *
//   * *
//     *


// *
// * *
// * * *
// * *
// *



//         *
//       *  *
//     *  *   *
//   *  *   *   * 
// *  *   *   *   *
public class Patterns {
    public static void main(String[] args) {
        // square(5);
        // decreasingRightAngledTriangle(5);
        // increasingRightAngledTriangle(5);
        // diamond(5);
        // plus(5);
        // symmetricalPattern(5);
        // hollow(5);
        // tringle(5);
        // reverseTriangle(5);
    }
    public static void square(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void decreasingRightAngledTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        
    }
    public static void increasingRightAngledTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        } 
    }
    public static void diamond(int n) {
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==j ||i+j==n+1){
                    System.err.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void plus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==(n/2)+1 || i==(n/2)+1){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void symmetricalPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(((i==1 ||i==n/2+1 || i==n) && ((j==1)||(j==n/2+1)||(j==n)))||((i!=1 && j!=1 && i!=n && j!=n))){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void hollow(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void tringle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        
    }
    public static void reverseTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("   ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    
}
