import java.io.BufferedReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.io.StreamTokenizer.*;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        try(
                BufferedReader read = Files.newBufferedReader(Paths.get("Person.txt"), UTF_8);
        )
        {
            int count = 0;
            StreamTokenizer word = new StreamTokenizer(read);
            while(read.readLine()!=-1)
            {

                switch (word.ttype) {
                    case TT_WORD:
                        count++;
                        break;
                    case TT_NUMBER:


                }
            }
            if(word)
        }
        catch(IOException exc){
            exc.printStackTrace();
        }
    }
}