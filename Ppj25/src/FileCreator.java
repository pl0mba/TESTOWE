import java.io.*;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String git = "inputData";
        int numOffiles = num.nextInt();
        String filenames[] = new String[numOffiles];
        for(int i=0;i<filenames.length;i++){
            filenames[i]= git + i;
        }
        try {
            for (String name : filenames) {
                BufferedWriter filesCreate = new BufferedWriter(new FileWriter(name + ".txt"));
                for(int i=0;i<10;i++){
                    String random = "" + Math.random()*1000;
                    filesCreate.write(""+random);
                    filesCreate.write(" ");
                }filesCreate.close();

            }
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
