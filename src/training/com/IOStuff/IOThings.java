package training.com.IOStuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sentinel on 6/28/17.
 */
public class IOThings {

    private void ReadLineByLine(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
            }
        } catch (IOException ex) {

        } catch (Exception ex) {

        }
    }

}
