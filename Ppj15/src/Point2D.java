import java.util.Scanner;

public class Point2D {
    int x, y;
    int dim[];
    Point2D(){
        x=0;
        y=0;
    }
    public int[] getPoint(int x, int y){
        dim[] = {x, y, 1};
        return dim;
    }
    public int[] setPoint(dim[]){
        Scanner scan = new Scanner(System.in);
        dim[0] = scan.nextInt();
        dim[1] = scan.nextInt();
        dim[2] = 1;
        return dim;
    }
}
