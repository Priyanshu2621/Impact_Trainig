package Week_3.Day_3;

public class MissingVowel {
    public static void main(String[]args) {
        String str = "aeiou";
        String str1 = "Priyanshu";
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str1.indexOf(ch) == -1){
                System.out.println("Missing vowel: " + ch);
            }
        }
    }
}
