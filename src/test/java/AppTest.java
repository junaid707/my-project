import com.example.App;
import org.junit.Test;
import static org.junit.Assert.*;

// Added a simple test case for the App class

public class AppTest {

    @Test
    public void testApp() {
        App myApp = new App();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}
