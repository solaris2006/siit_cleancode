package org.cleancode.notes.v2.di;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> developerList = new ArrayList<>();
        Developer javaDev = new JavaDeveloper();
        Developer jsDev = new JSDeveloper();
        developerList.add(javaDev);
        developerList.add(jsDev);


        Project project1 = new Project(developerList);
        Developer pythonDev = new PythonDev();
        project1.addDev(pythonDev);
        project1.implementFuture();


    }
}
