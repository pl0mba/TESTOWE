import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      /*  String[][] arr = {{"Germany", "2", "Scotland", "1"}, {"Poland", "2", "Germany", "0"},
                {"Germany", "1", "Ireland", "1"}, {"Poland", "2", "Scotland", "2"},
                {"Scotland", "1", "Ireland", "0"}, {"Ireland", "1", "Poland", "1"},
                {"Ireland", "1", "Scotland", "1"}, {"Germany", "3", "Poland", "1"},
                {"Scotland", "2", "Germany", "3"}, {"Ireland", "1", "Germany", "0"},
                {"Scotland", "2", "Poland", "2"}, {"Poland", "2", "Ireland", "1"}
        };
        int polpoints = 0;
        int gerpoints = 0;
        int irepoints = 0;
        int scotpoints = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String n = arr[i][j];

                switch (n) {
                    case "Germany":
                        gerpoints++;
                        break;
                    case "Poland":
                        polpoints++;
                        break;
                    case "Scotland":
                        scotpoints++;
                        break;
                    case "Ireland" :
                        irepoints++;
                        break;
                    default:break;

                }

            }
        }
        System.out.println("Germany " + gerpoints);
        System.out.println("Poland " + polpoints);
        System.out.println("Scotland " + scotpoints);
        System.out.println("Ireland "+ irepoints); */

        int arr[][] ={}
        for(int[][] t : trans(arr2))
        System.out.println(Arrays.toString(t));
        int arr3[][] = {
                {1,3,2},
                {3,4,8},
                {2,6,8},
                {1,8,5}
        };
    }

    static int[][] trans(int arr[][]){
        int arr2 = new arr2[][];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                        arr2[i][j]=arr[i][j];
            }
        }
        return arr2[][];
    }
    static int greatest(int arr3[]){
        int colsum1 = 0;
        int colsum2 = 0;
        int colsum3 = 0;
        int rowsum1 = 0;
        int rowsum2 = 0;
        int rowsum3 = 0;
        int rowsum4 = 0;
        int maxIncol;
        int maxInrow;
        for(int i =0; i<arr3.length; i++){
            for (int j = 0; j< arr3[i].length; j++) {
                if(i==0)
                    rowsum1+=arr3[i][j];
                if(i==1)
                    rowsum2+=arr3[i][j];
                if(i==2)
                    rowsum3+=arr3[i][j];
                if(i==3)
                    rowsum4=arr3[i][j];
                if(j==0)
                    colsum1+=arr3[i][j];
                if(j==1)
                    colsum2+=arr3[i][j];
                if(j==2)
                    colsum3+=arr3[i][j];
                if(rowsum1>rowsum2 && rowsum1>rowsum3 &&rowsum1>rowsum4)
                    maxInrow = 0;
                else if(rowsum2>rowsum1 && rowsum2>rowsum3 && rowsum2>rowsum4)
                    maxInrow = 1;
                else if(rowsum3>rowsum1 && rowsum3>rowsum2 &&rowsum3>rowsum4)
                    maxInrow = 2;
                else
                    maxInrow = 3;
                if(colsum1>colsum2 && colsum1>colsum3)
                    maxIncol = 0;
                if(colsum2>colsum1 && colsum2>colsum3)
                    maxIncol = 1;
                else
                    maxIncol = 2;
            }
        }
        System.out.println(maxInrow);
        System.out.println(maxIncol);
    }

}