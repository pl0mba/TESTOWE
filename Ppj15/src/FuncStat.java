public class Main {
    public static void main(String[] args) {
        FuncStat git = new FuncStat();
        git.fiboR(6);
        git.fiboI(6);
        git.factR(6);
        git.factI(6); //not working for odd numbers
        git.gcdR(32,24);
        git.gcdI(32,24);//dont know how to do that
        int[] arr = {5,2,7,2,4,7,3,2,3,7,2,3,23,5,2,6,3,26,3,3,2,3,2,3,42,24,25,23};
        git.maxElem(arr, 11);
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125,40643));
        System.out.println(FuncStat.gcdI(12125,40643));
        int[] a = {3,8,2,9,7,4};
        System.out.println("Max     : " + FuncStat.maxElem(a,0));
        System.out.println("Num even: " + FuncStat.numEven(a,0));

    }
}
public class FuncStat {
    // worth mentioning
       /* static int[][] rotate(int[][] matrix){
       for(int[] z : matrix)
           for(int c : z)
           System.out.println(c);
        for(int i =0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(i> matrix.length/2 && j<matrix[i].length/2)
                matrix[i][j+1]=matrix[i][j];
                if(i< matrix.length/2 && j> matrix[i].length/2)
                    matrix[i+1][j]=matrix[i][j];
                if(i> matrix.length/2 && j> matrix[i].length/2)
                    matrix[i][j-1]=matrix[i][j];
                if(i<matrix.length/2 && j<matrix[i].length/2)
                    matrix[i-1][j]=matrix[i][j];
            }
        }
        for(int[] z : matrix)
            for(int c : z)
                System.out.println(c);
return rotate(matrix);
    } */

    public static int fiboR(int n) {
        if (n >= 0 && n < 2) {
            return n;
        }
        if (n >= 2) {
            n = n - 1 + n - 2;
            return fiboR(n);
        } else return -1;
    }

    public static int fiboI(int n) {
        if (n >= 0 && n < 2)
            return n;
        if (n >= 2)
            return n - 1 + n - 2;
        else
            return -1;
    }

    public static int factR(int n) {
        int num = n - 1;
        if (num == 0)
            return n;
        else
            return (num - 1) * factR(num);
    }

    public static int factI(int n) {
        int g = 1;
        for (int i = n; i > 1; i--) {
            n = (n * n - 1);
            g *= n;
            n = n - 2;
        }
    }

    public static int gcdR(int a, int b) {
        if (a == 0 || b == 0 && a > b) return a;
        else if (a == 0 || b == 0 && b > a) return b;
        if (a > b) {
            a = a % b;
            return gcdR(a, b);
        }
        if (b > a) {
            b = b % a;
            return gcdR(a, b);
        }
    }

    public static int gcdI(int a, int b) {
        if (a == 0 || b == 0 && a > b)
            return a;
        else {
            while (a > b) {
                a = a % b;
            }
        }
    }

    public static int maxElem(int[] arr, int from) {
        int i;
        int max;
        for (i = from; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    } // dont know how to do it recursevily got issues with variable max probably have somehow not to use it

    public static int numEven(int[] arr, int from) {
        int counter;
        if (arr[from] % 2 == 0 && from < arr.length) {
            counter++;
            return numEven(arr, from++);
        } else if (from < arr.length)
            return numEven(arr, from++);
        else return counter;
    }

    public static void reverse(int[] arr, int from) {

    }

    public static boolean isLess(String a, String b) {
        if (a.length() < b.length())
            return true;
       // if (a.length() == b.length())
         //   return false;
        else return false;
    }

    public static String[] sortSel(String[] a) {
        int i, j, g;
        i = 0;
        j = a.length - 1;
        if (i >= j)
            return a;
        else if (j > i) {
            if (a[i].length() > a[j].length()) {
                g = a[j];
                a[j] = a[i];
                a[i]=g;
                i++;
                j--;
                return sortSel(a);
            }
            else {
             j--;
             i++;
             return sortSel(a);
            }
        }
        // for(i =0; i<a.length/2; i++){
        //     String[i].compareTo(String[j])
    }

}
