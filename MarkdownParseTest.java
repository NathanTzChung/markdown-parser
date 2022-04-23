import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    //Leaving this as a comment so I can commit again with the commands used to run the test


    //testing test-file.md
    @Test
    public void testfile() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

    //testing the rest of the files
    @Test
    public void break1() throws IOException {
        Path fileName = Path.of("break.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com"), MarkdownParse.getLinks(content));
    }

    @Test
    public void break2() throws IOException {
        Path fileName = Path.of("break2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    }

    @Test
    public void break3() throws IOException {
        Path fileName = Path.of("break3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    }
}