package myapp.core;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReaderMain {

    public static void main ( String [] args ) throws FileNotFoundException, IOException {

        String srcFile = args[0];

        String line = "";

        try {
            Reader reader = new FileReader(srcFile);

            BufferedReader br = new BufferedReader(reader);

            while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            System.out.printf("race: %s, math: %s, reading: %s, writing: %s\n", values[1], values[5],values[6], values[7]);
            }

            reader.close();

        } catch (FileNotFoundException ex) {
            System.err.printf("Error: %s\n ", ex.getMessage());
        } catch (IOException ex) {
            System.err.printf("Error: %s\n ", ex.getMessage());
        }

       
    }

}
