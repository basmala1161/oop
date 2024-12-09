import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class file {
    private static String path;

    public file(String path) {
        this.path = path;
    }

    public static List<String> read() throws IOException {
        List<String> data = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            data.add(line);
        }
        reader.close();
        return data;
    }

    public static void write(List<String> data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (String record : data) {
            writer.write(record);
            writer.newLine();
        }
        writer.close();
    }
}
