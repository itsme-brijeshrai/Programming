import java.util.Scanner;

public class CharArrayPassword {
    public static void main(String[] args) {
        //Storing password in char array
        Scanner in = new Scanner(System.in);
        System.out.println("create your password");
        String string = in.next();
        in.close();
        check(string);
    }
    static void check(String string){
        char[] password = string.toCharArray();
        for (int i = 0; i < password.length; i++) {
            password[i]=0;
        }
        System.out.println(password);
    }
}
