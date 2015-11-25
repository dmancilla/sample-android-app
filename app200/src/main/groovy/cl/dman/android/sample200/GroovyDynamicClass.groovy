package cl.dman.android.sample200

import groovy.transform.Canonical

@Canonical
class GroovyDynamicClass {
    def name

    def toUpperCase() {
        name.toUpperCase()
    }
}
