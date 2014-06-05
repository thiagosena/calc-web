import org.apache.log4j.Logger;
import org.junit.*;

import controllers.Application;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;

public class ApplicationTest extends FunctionalTest {
	static final Logger logger = Logger.getLogger(ApplicationTest.class);

	@Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertEquals(a, 2);
    }

    @Test
    public void renderParseSumUrl() {
        Application teste = new Application();
        String result = teste.parse("http://calclib-thiagosena.rhcloud.com/calclib/sum?valor1=10&valor2=20");
        logger.info("renderParseSumUrl() 10 + 20: " + result);
        assertEquals(result, "30.0");
    }
    
    @Test
    public void renderParseMinusUrl() {
        Application teste = new Application();
        String result = teste.parse("http://calclib-thiagosena.rhcloud.com/calclib/minus?valor1=20&valor2=10");
        logger.info("renderParseMinusUrl() 20 - 10: " + result);
        assertEquals(result, "10.0");
    }
    @Test
    public void renderParseMultUrl() {
        Application teste = new Application();
        String result = teste.parse("http://calclib-thiagosena.rhcloud.com/calclib/mult?valor1=20&valor2=10");
        logger.info("renderParseMultUrl() 20 * 10: " + result);
        assertEquals(result, "200.0");
    }
    
    @Test
    public void renderParseDivUrl() {
        Application teste = new Application();
        String result = teste.parse("http://calclib-thiagosena.rhcloud.com/calclib/div?valor1=20&valor2=10");
        logger.info("renderParseDivUrl() 20 / 10: " + result);
        assertEquals(result, "2.0");
    }
}