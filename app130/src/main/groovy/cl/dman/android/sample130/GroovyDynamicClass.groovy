package cl.dman.android.sample130

import groovy.transform.Canonical

@Canonical
class GroovyDynamicClass {
    def name

    def toUpperCase() {
        name.toUpperCase()
    }
}
