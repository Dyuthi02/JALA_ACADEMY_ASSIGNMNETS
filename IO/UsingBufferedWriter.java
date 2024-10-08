//Write text to a .txt file using BufferedWriter

import java.io.*;

public class UsingBufferedWriter {
    public static void main(String[] args) {

        String s = "This text is written using BufferedWriter.";

        try {
            // Creates a FileWriter
            //file path passed as parameter to the FileWriter constructor.
            FileWriter fw = new FileWriter("bw.txt");
            // Creates a BufferedWriter
            BufferedWriter bw = new BufferedWriter(fw);

            //provides method to write string directly.
            bw.write(s);
            //closing FileWriter and BufferedWriter
            bw.close();
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            e.printStackTrace();
        }
    }
}
