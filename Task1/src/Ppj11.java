import java.util.Scanner;
public class Ppj11 {
    public static void main(String[] args) {
/*        Scanner gArr = new Scanner(System.in);
        int arr[] = new int[10];
        int max, min;
        max=min=50;
        int biggest=0;
        int lowest=0;
        System.out.println("the first array ");
        for(int i = 0; i<arr.length; i++){
            arr[i]=(int)(Math.random()*1000);
            if(arr[i]>max){
                max=arr[i];
                biggest=i;
            }
            else if(arr[i]<min){
               min=arr[i];
               lowest=i;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the difference beetwen max and min ");
        System.out.println(max-min);
        System.out.println();
        System.out.println("the second array ");
        for(int i = 0;i<arr.length; i++){
            if(arr[i]>=max)
                arr[i]=arr[lowest];
            if(arr[i]<=min)
                arr[i]=arr[biggest];
            System.out.print(arr[i]+ " ");
        }
*/
        int max = 0;
        int arr[]= {4,12,2,5,8};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int line=max; line>0; line--){
            for(int index=0;index<arr.length; index++) {
                if (arr[index] >= line)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        //-----------------------------------------------------------------
        int first = arr[0];
        for(int i = 0; i<arr.length-1; i++) {

            arr[i] = arr[i + 1];
            System.out.print(arr[i]+" ");
        }            System.out.print(first);

        //--------------------------------------------------------------

        int arr2[] = {3,6,2,3,8,15,16,13,2,5,1,2,5,3,5};

        for(int i = 0; i<arr2.length; i++){
            for(int j =0; j <arr2.length; i++){
                if(arr2[i]==arr2[j])
                    arr2[j].delete();
            }
            System.out.print(arr2[i]+" ");
        }
    }
}