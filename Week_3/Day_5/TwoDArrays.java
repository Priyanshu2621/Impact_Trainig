package Week_3.Day_5;
import java.util.Scanner;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int k=0; k<rows; k++){
            int max =  0;
                for(int l=0; l<cols; l++){
                    max = Math.max(max, arr[k][l]);
                }            
                System.out.println("The maximum element in row  is: " + max);
            }
            
        }
        
    }

