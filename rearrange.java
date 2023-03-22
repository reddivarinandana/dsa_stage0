class Main {
public static void main(String[] args) {
       int arr[] = {-1,2,-3,3,6,9,8,-11};
   public static void rearrange(int[] arr){
       int i = 0, j = 0;
       while (j < arr.length) {
           if (arr[j] >= 0) {
               j++;
           }
           else {
               for (int k = j; k > i; k--) {
                   int temp = arr[k];
                   arr[k] = arr[k - 1];
                   arr[k - 1] = temp;
               }
               i++;
               j++;
           }
            rearrange(arr);
       for (int i : arr) {
           System.out.println(i + " ");
       }
       }
   }
}
}