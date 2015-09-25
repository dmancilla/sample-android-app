package cl.dman.android.sample130

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@CompileStatic
@Canonical
class GroovyCompiledClass {
    String name

    String toUpperCase() {
        name.toUpperCase()
    }

}
