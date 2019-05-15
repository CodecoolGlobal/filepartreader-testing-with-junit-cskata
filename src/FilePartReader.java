import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringJoiner;

public class FilePartReader {
    private String filePath;
    private Integer fromLine;
    private Integer toLine;

    public FilePartReader() {
        this.filePath = "D:\\Codecool\\OOP\\junit_testfile.txt";
        this.fromLine = 1;
        this.toLine = 5;
    }

    public void setup(String filePath, Integer fromLine, Integer toLine) {
        if (toLine < fromLine) {
            throw new IllegalArgumentException("3rd parameter must be bigger than the 2nd");
        }

        if (1 < fromLine) {
            throw new IllegalArgumentException("You should start at the beginning genius...");
        }

        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public String read() throws IOException {
        Scanner in = new Scanner(new FileReader(this.filePath));
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            in.useDelimiter("\\Z");
            sb.append(in.next());
        }

        return sb.toString();
    }

    public String readLines() throws IOException {
        String file = this.read();
        String[] lines = file.split("\\r?\\n");

        StringJoiner sj = new StringJoiner(" ");

        for (int i = this.fromLine - 1; i < this.toLine; i++) {
            sj.add(lines[i]);
        }

        return sj.toString();
    }
}
