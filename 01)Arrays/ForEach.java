import  java.util.*;
public class ForEach{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = in.nextInt();
        }
        for (int num:arr){
            System.out.print(num + " ");
        }
    }
}
