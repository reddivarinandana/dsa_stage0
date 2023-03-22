public class Main {
    public static void main(String[] args) {
        char c = 'a';
        if((c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9'))
            System.out.println(c + " is an alphanumeric");
        else
            System.out.println(c + " is not an alphanumeric");
    }
}