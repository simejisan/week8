/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;

public class TestThrows5 {
    public static String FileNotFoundException
    private final Object args;

    {
        public String fileName = "input.txt";
        public static void main (String[] args){
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(new File(fileName),true));
        }

    }
    }
*/

/*public static void main (String[] args) throw FileNotFoundException{
    File file = new File("infile.txt");
    System.out.println (file.exists());
    Scanner scan = new Scanner (file);

        }
        */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestThrows5 {
public static void main (String [] args) throws FileNotFoundException {
    File file = new File ("infile.txt");
    System.out.println(file.exists());
    Scanner scan = new Scanner(file);
}
}