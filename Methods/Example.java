public class Example{
    public static void demo(){
        int a=10;
        System.out.println("Hello from demo()");
        demo1();
    }
    public static void demo1(){
        int a=100;
        System.out.println("Hello from demo1()");
        System.out.println(a);
    }
    public static void main(String args[]){
        System.out.println("Hello from main()");
        demo();//method singature
    }    
}