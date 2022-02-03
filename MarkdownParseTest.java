import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;


public class MarkdownParseTest {

	@Test
	public void testFile1() throws IOException{
        ArrayList<String> result = MarkdownParse.getLinks(Files.readString(Path.of("test-file1.md")));
        List<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");
        newList.add("google.com");

        assertEquals(newList, result);
	}

    @Test
	public void testFile2() throws IOException{
        ArrayList<String> result = MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md")));
        List<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");

        assertEquals(newList, result);
	}

    @Test
	public void testFile3() throws IOException{
        ArrayList<String> result = MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md")));
        List<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");
        newList.add("google.com");

        assertEquals(newList, result);
	}

    /*@Test
	public void testFile4() throws IOException{
        ArrayList<String> result = MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md")));
        List<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");
        newList.add("(test.com)");

        assertEquals(newList, result);
	}

    @Test
	public void testFile5() throws IOException{
        ArrayList<String> result = MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md")));
        List<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");
        newList.add("www.name.com");

        assertEquals(newList, result);*/
	}
}