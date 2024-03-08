public class PrintA2Z {
    public static void main(String args[]){
        // char character='A';
        // while(character<='z'){
        //     System.out.println(character);
        //     character++;
        // }
        char x=1;
        int a=1;
        while(x<=127){
            System.out.println(a+"\t "+x);
            a++;
            x++;
        }
    }
}
