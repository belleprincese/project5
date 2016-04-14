import java.io.*;
import java.util.*;

public class AES {
    public static void main(String[] args) throws IOException{
        // Encrypt encode = new Encrypt();
        // Decrypt decode = new Decrypt();

        long getStartTime = System.currentTimeMillis(); // start timing

        // take input name and create output name and file
        String inputName = args[2]; // name of the input file
        if(args[0].equals("e") && args.length == 3){ // encryption
            File enOutFile = new File(inputName + ".enc");
            FileWriter eFW = new FileWriter(enOutFile);
            BufferedWriter eBufW = new BufferedWriter(eFW);

            // try{
            //     encode.doEncrypt(); // NEED TO FILL THIS IN
            // }catch(IOException e){
            //     System.out.println("Error");
            // }
        }else if(args[0].equals("d") && args.length == 3){ // decryption
            File deOutFile = new File(inputName + ".dec");
            FileWriter dFW = new FileWriter(deOutFile);
            BufferedWriter dBufW = new BufferedWriter(dFW);

            // try{
            //     decode.doDecrypt(); // NEED TO FILL THIS IN
            // }catch(IOException e){
            //     System.out.println("Error");
            // }
        }else{
            System.out.println("Error! Please enter valid commands.");
        }
    }
}