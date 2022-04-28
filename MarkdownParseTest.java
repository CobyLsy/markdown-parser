import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.nio.file.Files;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest extends MarkdownParse{
    private String content;
    private ArrayList<String> Links;
    Path filename;


    @Before
    public void setUp() throws IOException{
        filename = Path.of("test-file.md");
        content = Files.readString(filename);
        Links = getLinks(content);
    }

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() {
        List<String> list = List.of("https://something.com", "some-thing.html");
        assertEquals(list, Links);
    }
    
    @Test
    public void getLinksTest2() {
        filename = Path.of("test-file2.md");
        content = Files.readString(filename);
        Links = getLinks(content);
        List<String> list = List.of("https://something.com", "some-thing.html");
        assertEquals(list, Links);
    }

}
