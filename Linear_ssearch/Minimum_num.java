public class Minimum_num {
    public static void main(String[] args) {
        int[] arr = {0, 7, -7, -3, 9, 400};
        System.out.println(min(arr));
    }
    static int min(int arr[]){

        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] <  ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
