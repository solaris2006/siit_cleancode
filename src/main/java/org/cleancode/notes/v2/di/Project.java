package org.cleancode.notes.v2.di;

import java.util.List;

public class Project {

    List<Developer> developerList;

    public Project(List<Developer> developerList) {
        this.developerList = developerList;
    }

    public void addDev(Developer developer) {
        developerList.add(developer);
    }

    public void implementFuture() {
        for (Developer developer : developerList) {
            developer.develop();
        }
    }
}
