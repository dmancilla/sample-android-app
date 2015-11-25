package cl.dman.android.sample200;

public class JavaClass {

    private String name;

    public JavaClass(String name) {
        this.name = name;
    }

    public String toUpperCase() {
        return name.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
