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
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

    //testing the rest of the files
    @Test
    public void break1() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/break.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com"), MarkdownParse.getLinks(content));
    }

    @Test
    public void break2() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/break2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    }

    @Test
    public void break3() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/break3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    }

    //Part 6 for lab4 Writeup
    @Test
    public void testfile2() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile3() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile4() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile5() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile6() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile7() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile8() throws IOException {
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/4_15_Lab3/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(content));
    }
}