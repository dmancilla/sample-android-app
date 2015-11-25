package cl.dman.android.sample200

import groovy.transform.CompileStatic
import org.junit.Test

@CompileStatic
class GroovyUnitTest {

    static final String LNAME = 'dman.-'
    static final String UNAME = 'DMAN.-'

    @Test
    void testDynamicClass() {
        def dynamicClass = new GroovyDynamicClass(LNAME)
        assert LNAME == dynamicClass.name
        assert UNAME == dynamicClass.toUpperCase()
    }

    @Test
    void testCompiledClass() {
        def compiledClass = new GroovyCompiledClass(LNAME)
        assert LNAME == compiledClass.name
        assert UNAME == compiledClass.toUpperCase()
    }

    @Test
    void testJavaClass() {
        def javaClass = new JavaClass(LNAME)
        assert LNAME == javaClass.name
        assert UNAME == javaClass.toUpperCase()
    }

}
