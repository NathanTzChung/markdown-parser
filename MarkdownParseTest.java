import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class MarkdownParseTest {

    // @Test
    // public void addition() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void break1() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("break.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://google.com"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void break2() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("break2.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void break3() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("break3.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    // }

    // // Stuff from the TAs
    // @Test
    // public void testfile2() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file2.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile3() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file3.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile4() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file4.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }
    
    // @Test
    // public void testfile5() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file5.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile6() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file6.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile7() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file7.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile8() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("test-file8.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfilewow() throws IOException {
    //     // Read stuff from file
    //     Path fileName = Path.of("new_test_file.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    //Below are the tests with the absolute paths so I can run the tests on my end
    @Test
    public void addition() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void break1() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/break.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com"), MarkdownParse.getLinks(content));
    }

    @Test
    public void break2() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/break2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    }

    @Test
    public void break3() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/break3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://google.com", "https://twitch.tv"), MarkdownParse.getLinks(content));
    }

    // Stuff from the TAs
    @Test
    public void testfile2() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile3() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile4() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }
    
    @Test
    public void testfile5() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile6() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile7() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfile8() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(content));
    }

    @Test
    public void testfilewow() throws IOException {
        // Read stuff from file
        Path fileName = Path.of("C:/UCSD_2021-2022/Q3/CSE 15L/my_markdown_parser/markdown-parser/new_test_file.md");
        String content = Files.readString(fileName);
        assertEquals(List.of(), MarkdownParse.getLinks(content));
    }
}

