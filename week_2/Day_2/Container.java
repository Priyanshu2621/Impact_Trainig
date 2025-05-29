import java.util.*;
public class Container{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of container:");
        int n = sc.nextInt();
        int cont[] = new int[n];
        System.out.println("Enter the maxs and mins capacity in container:");
        for(int i=0;i<n;i++){
            cont[i] = sc.nextInt();
        }
        java.util.Arrays.sort(cont);
        int left = 0;
        int right = n-1;
        while(left<right){
            System.out.println("("+cont[right]+","+cont[left]+")");
            left++;
            right--;
        }
        
    }
}