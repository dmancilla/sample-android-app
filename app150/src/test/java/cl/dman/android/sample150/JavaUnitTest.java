package cl.dman.android.sample150;

import org.junit.Assert;
import org.junit.Test;

public class JavaUnitTest {

    @Test
    public void testJavaClass() {
        JavaClass javaClass = new JavaClass("dman.-");
        Assert.assertEquals("dman.-", javaClass.getName());
        Assert.assertEquals("DMAN.-", javaClass.toUpperCase());
    }
}
