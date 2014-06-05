import org.junit.*;

import controllers.Application;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;

public class ApplicationTest extends FunctionalTest {

	@Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertEquals(a, 2);
    }

    @Test
    public void renderParseSumUrl() {
        Application teste = new Application();
        String result = teste.parse("http://calclib-thiagosena.rhcloud.com/calclib/sum?valor1=10&valor2=20");
        assertEquals(result, "30.0");
    }
    
    @Test
    public void renderParseMinusUrl() {
        Application teste = new Application();
        String result = teste.parse("http://calclib-thiagosena.rhcloud.com/calclib/minus?valor1=20&valor2=10");
        assertEquals(result, "10.0");
    }
}