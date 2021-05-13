package org.cleancode.notes.v2.di;

public class JSDeveloper implements Developer{
    private void writeJavaScrip(){
        System.out.println("write java script");
    }

    @Override
    public void develop() {
        writeJavaScrip();
    }
}
