public class LeftDiagonal {
    public static void main(String args[]){
        int n=6;
        int x=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n||x==j){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            x--;
        }
    }
}
