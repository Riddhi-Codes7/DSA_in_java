public class Searching_in_strings {

    public static void main(String[] args) {
        String name = "Riddhi";
        char target = 'm';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){

        if (str.length() == 0){ //str.length() is a function
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}