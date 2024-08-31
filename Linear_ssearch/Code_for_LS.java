public class Code_for_LS {
    public static void main(String[] args) {

        int[] arr = {21, 31, 456, 78, 90, -6, 8, 98, 90};
        int ans = Linear_search(arr, 90);
        System.out.println(ans);
    }
    //Returning the element
//    static int Linear_search2(int[] arr, int target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int element: arr) {
//            if(element == target){
//                return element;
//
//        }
//    }

            //searching in the array: return the index if the item found
            //otherwise return -1
   static int Linear_search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        //run for loop
        for (int index = 0; index < arr.length ; index++){
            //check element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if the target is not found
        return -1;
    }
        }
