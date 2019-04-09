package de.consol.devday.markdown;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class MarkdownServiceTest {

    @Test
    public void formatList() {
        MarkdownService service = new MarkdownService();
        List<String> abc = List.of("a", "b", "c");
        Assert.assertEquals("* a\n* b\n* c", service.formatList(abc));
    }
}
