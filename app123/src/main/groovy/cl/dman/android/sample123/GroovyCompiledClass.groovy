package cl.dman.android.sample123

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
