import java.util.Arrays;

public class Image {
    public static void main(String[] args) {
        int[][] pixels = {
                {1, 2, 3},
                {4, 5, 6}
        };
        show(pixels);
        flipHorizontaly(pixels);
        show(pixels);

    }

    public static int[][] flipHorizontaly(int[][] pixels) {
        int prev[][] = pixels[][];
        for(int i=0; i< pixels.length; i++){
            for(int j=0; j<pixels[i].length;j++){
                if(i<(pixels.length/2)) {
                    prev[i][j] = pixels[i][j];
                    pixels[i][j] = pixels[i + (pixels.length / 2)][j];
                }
                else {
                    pixels[i][j] = prev[i][j];
                }
            }
        }

        return pixels;
    }
    static void show(int[][] pixels){
        System.out.println(Arrays.deepToString(pixels));
    }
}
