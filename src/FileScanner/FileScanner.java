package FileScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Admin\\Desktop\\Sdudy_Java\\StudyJava\\src\\FileScanner\\input.txt");
        Scanner scanner = new Scanner(file);

        if(scanner.hasNextLine()){
            String string = scanner.nextLine();
            System.out.println(string);
        }
    }
}
