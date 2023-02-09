import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("PPJ_20230119.pdf");
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("nowy plik.txt"));
            int space = Integer.parseInt(" ");
            int count = 0;
            String word = "";
            while(input.read()!=-1) {
                while (input.read() != space) {
                    word+=input.read();
                    count++;
                    if(count>=4)
                        output.write(input.read());
                }
            }

        }
        catch(IOException exc){
            exc.printStackTrace();
        }

    }


}