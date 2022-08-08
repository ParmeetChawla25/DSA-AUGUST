package Quetions;

public class Q1 {
    static boolean search(String str,char key){
        if(str.length() == 0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Kunal";
        char key = 'u';
        if (search(str,key)){
            System.out.println("The given key is present in the string");
        }
        else{
            System.out.println("The given key is not present in the string");
        }
    }
}
