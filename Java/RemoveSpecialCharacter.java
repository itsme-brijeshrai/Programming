public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        //Remove special character from the given String;
        String string = "B*r*i*j*e*s*h*r*a*i*@9*8*4*8";
        System.out.println(check(string));
    }
    static String check(String string){
        String s = "";
        for(int i=0;i<string.length();i++){
            if(Character.isLetter(string.charAt(i))){
                s+=string.charAt(i);
            }
        }
        return s;
    }
}
