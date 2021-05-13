package org.cleancode.notes.v2.di;

public class JavaDeveloper implements Developer {
    private void writeJavaCode() {
        System.out.println("java code");
    }

    @Override
    public void develop() {
        writeJavaCode();
    }
}
