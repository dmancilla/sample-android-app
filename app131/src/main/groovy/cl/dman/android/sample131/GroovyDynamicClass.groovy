package cl.dman.android.sample131

import groovy.transform.Canonical

@Canonical
class GroovyDynamicClass {
    def name

    def toUpperCase() {
        name.toUpperCase()
    }
}
