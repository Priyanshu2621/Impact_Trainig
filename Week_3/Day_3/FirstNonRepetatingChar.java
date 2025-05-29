package Week_3.Day_3;
public class FirstNonRepetatingChar {
    public static void main(String[] args){
        String str = "swiss";
        int n=str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
