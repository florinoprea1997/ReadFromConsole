import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleReader {
    private String textFromConsole;
    private String fileLocation;

    public ConsoleReader(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public ConsoleReader() {

    }

    public void readFromConsole() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Scrie mesajul: ");
        textFromConsole = reader.nextLine();
    }
    public void writeInFile(){
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(fileLocation));
            file.write(textFromConsole);
            file.close();
        }
        catch (IOException e){
            System.out.println("Eroare la deschiderea fisierului: "+ e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Eroare la gasirea fisierului: "+ e.getMessage());
        }
    }
    public void setPath(String path){
        fileLocation=path;
    }

}
