import com.smu.mscda.Main;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void testMain() {
        String input = "hello";
        String expectedOutput = "Enter a string in lowercase:\r\n" +
                "Capitalized Input: Hello\r\n" +
                "MD5 Hex: 8b1a9953c4611296a827abf8c47804d7\r\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Main.main(new String[]{});

        assertTrue(out.toString().contains(expectedOutput));
    }
}
