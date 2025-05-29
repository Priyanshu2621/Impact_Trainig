import java.util.*;
class Main {
    public static void main(String[] args){
        int[]  arr = {1,2,3,4,5,6};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(arr[i] % 2 != 0){
                list.add(arr[i]);
            }
        }
        for(int i = 0;i < n;i++){
            if(arr[i] % 2 == 0){
                list.add(arr[i]);
            }
        }
System.out.println(list);
    
    }
}