package Day8_IOStream_Serialization.Q2;

import java.io.*;

public class Bufferedreader {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C://File&IOStream//abc.txt");

        BufferedReader br = new BufferedReader(fileReader);

        String s = br.readLine();

        while(s != null){
            //readLine() will return null if nextLine is not available

            System.out.println(s);

            s = br.readLine();
        }

    }

    
}
