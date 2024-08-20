package practice_classes;

import javax.swing.*;
import java.io.*;

public class InputStreamClass {
    public static void main(String[] args) throws FileNotFoundException {

        JFileChooser fileChooser = new JFileChooser("");
        fileChooser.showOpenDialog(null);
        String filePathSelection = fileChooser.getSelectedFile().getAbsolutePath();
        try(InputStream myStream = new FileInputStream(filePathSelection)){

            /*PRINT ALL THE DATA in BYTES
            byte [] fileData = myStream.readAllBytes();
            for(byte data : fileData){
                System.out.print((char) data);
            }
            */

            /*PRINT ALL THE DATA in SPECIFIC SIZE OF BYTES
            byte [] fileDataSpecific = new byte [8];
            int dataNumericValue = myStream.read(fileDataSpecific);

            while(dataNumericValue != -1){
                for(byte data : fileDataSpecific){
                    System.out.print((char) data);
                }
                dataNumericValue = myStream.read(fileDataSpecific);
            }
            */

            /*
            //PRINT ALL THE DATA in NUMERIC type
            int numericData = myStream.read();
            while(numericData != -1){
                System.out.print((char)numericData);
                numericData = myStream.read();
            }
            */

            /*BEST FORM*/
            BufferedInputStream myBuffer = new BufferedInputStream(myStream);
            int bufferData = myBuffer.read();
            while(bufferData != -1){
                System.out.print((char) bufferData);
                bufferData = myBuffer.read();
            }
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
