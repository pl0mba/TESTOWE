public class Colored {
    public static void main(String[] args) {
        int a = (int) (Math.random()*254+1);
        int red = (int) (Math.random()*254+1);
        int green = (int) (Math.random()*254+1);
        int blue = (int) (Math.random()*254+1);

        int color = a+red+green+blue;
    }
}
