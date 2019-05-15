import java.util.ArrayList;
import java.util.List;

public class FileWordAnalyzer {
    private FilePartReader filePartReader;

    public FileWordAnalyzer(FilePartReader filePartReader) {
        this.filePartReader = filePartReader;
    }

    public List<String> getWordsOrderedAlphabetically () {
        List<String> abcOrderedWords = new ArrayList<>();

        return abcOrderedWords;
    }
}
