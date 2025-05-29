package Week_3.Day_6;
import java.util.Scanner;

public class IntAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int sum = 0;
        String temp="";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }
            else{
                if(!temp.equals("")){
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if(!temp.equals("")){
            sum+=Integer.parseInt(temp);
        }
        System.out.println(sum);

    }
    
}