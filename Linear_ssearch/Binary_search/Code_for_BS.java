ublic class Code_for_BS {

    public static void main(String[] args) {
        int arr[] = {-89, -56, 0, 2, 6, 8, 14, 56, 67, 89, 90, 112, 156, 267, 578, 1000};
        int target = 899;
        int ans = binary_search(arr, target);
        System.out.println(ans);
    }

    static int binary_search(int[] arr, int target){

        int start = 0; // talking about index
        int end = arr.length - 1;   // talking about index

        while(start <= end ){
            //finding the middle element
    // int mid = (start + end)/2 ; //this might exceed the integer range so, will give error at the time of answer

            int mid = start + (end - start)/ 2;

            if (target < arr[mid]){
                //target will lie on the L.H.S,so
                end = mid - 1;
            } else if (target > arr[mid]) {
                //target will lie on the R.H.S,so
                start = mid + 1;
            }
            else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
