public class FindSpecialCharacter {
    public static void main(String[] args) {
        //Find Special Characters In The String And Print
        String string = "A@$BRI*SH";
        System.out.println(specialCharacter(string));
    }
    static String specialCharacter(String string){
        int counter = 0;
        for(int i=0;i<string.length();i++){
            if(!Character.isDigit(string.charAt(i)) && !Character.isLetter(string.charAt(i))
            && !Character.isWhitespace(string.charAt(i))){
                counter++;
            }
        }
        if(counter == 0){
            return "There are no special characters in the given string";
        }else{
            return "special characters found in the given string is -> "+counter;
        }
    
    }
}
