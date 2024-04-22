public class Var_argsMethod {
    public static void main(String args[]){
        add(1,2);// parameterized method called
        add(3,6,8,2); // var-args method called 
    }
    public static void add(int ...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
    public static void add(int a,int b){
        System.out.println("Parameterized method");
    }
}
