public class PrintBuzzCharacter {
    public static void main(String args[]){
        char a='A';
        while(a<='Z'){
            if(a%7==0 || a%10==7){
                System.out.println((int)a+"\t"+a);
            }
            a++;
        }
    }
}
