package cl.dman.android.sample200

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
