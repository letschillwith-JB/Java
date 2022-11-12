package Day8_IOStream_Serialization.Q1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewProgram {
    public static void main(String[] args) throws IOException {
        File f = new File("c://File&IOStream//abc.txt");

        f.createNewFile();

        FileWriter fileWriter = new FileWriter(f);

        Scanner sc = new Scanner(System.in);

        System.out.println("Write name of Employee");
        String empName = sc.nextLine();

        System.out.println("Write address of Employee");
        String empAdd = sc.nextLine();

        fileWriter.write("Employee name is: "+empName+" & Address is: "+empAdd);

        fileWriter.flush();
        fileWriter.close();

        System.out.println("Successfully added");
    }
}
