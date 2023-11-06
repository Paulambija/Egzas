import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class PirmaUzduotis {
    public static void main(String[] args) {
        String filePath = "G:/Java mokymai/Kartojimas/OOP Paskaitos/Egzas/Traškutė.txt";
        String firstLine = "Made in Paulambija ";
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(firstLine + "\n");
            writer.close();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Iveskite savo varda: ");
            String vardas = scanner.next();
            scanner.close();
            System.out.println("Puikus receptas iš: " + vardas);
        } catch (IOException e) {

            System.err.println("Error writing to the file: " + e.getMessage());
        }
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}




