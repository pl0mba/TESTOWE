public class Recur {
int counter;
    static int count(int[] arr, int from, int what) {
            if (arr[from] == what) {
                return 1+count(arr[], from++, what);
        }
            else
                return count(arr[], from++, what);
    }
    public static void main(String[] args) {
        int[] a = {2,3,2,4,3,1,6,3,2,3};
        System.out.println("2 -> " + count(a,0,2));
        System.out.println("3 -> " + count(a,0,3));
    }
}
