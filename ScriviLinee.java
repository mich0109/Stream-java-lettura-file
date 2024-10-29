import java.io.*;

public class ScriviLinee {
    public ScriviLinee(String nomeFile) throws IOException {
        // Incapsula FileWriter in PrintWriter per scrivere sul file
        PrintWriter scrittura = new PrintWriter(new FileWriter(nomeFile));
        // Incapsula System.in in InputStreamReader e BufferedReader per leggere da console
        BufferedReader lettura = new BufferedReader(new InputStreamReader(System.in));

        // Legge la prima linea da console
        String linea = lettura.readLine();
        // Continua a leggere fino a quando la linea non è vuota
        while (!linea.equals("")) {
            scrittura.println(linea); // Scrive la linea nel file
            linea = lettura.readLine(); // Legge la successiva linea
        }

        // Chiude gli stream
        lettura.close();
        scrittura.close();
    }
}

