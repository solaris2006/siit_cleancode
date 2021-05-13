package org.cleancode.notes.v2.di.bad;

public class Main {
    public static void main(String[] args) {
        BackendDeveloper backendDeveloper = new BackendDeveloper();
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

        Project project1 = new Project(backendDeveloper, frontendDeveloper);
        project1.implementFuture();
    }
}
