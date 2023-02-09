public class Main {
    public static void main(String[] args) {
        int[] a = {2, 5,18,24,13,15,13,11,2,5,8,2,};
        System.out.println(a);
        sWaping(a);
    }

 /*   public static int minus(int[] arr){
        int first=0;
        int last = 0;
        for(int i = 0 ;i<arr.length; i++){
            first = arr[0];
            if(i%2==0){
                last = arr[i];
            }
            else if(arr.length<=2){
                return -1;
            }
        }
        return last-first;
    } */
 static void sWaping(int[] arr){
        int greatestIn = 0;
        int lowestIn = 0;
        int biggest = 0;
        int lowest = 50;
        int b;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=biggest){
                arr[greatestIn]=arr[i];
            }
            else if(arr[i]<=lowest){
                arr[lowestIn]=arr[i];
            }
         b = greatestIn;
            arr[greatestIn]=arr[lowestIn];
            arr[lowestIn]=arr[b];
        }
    }
}