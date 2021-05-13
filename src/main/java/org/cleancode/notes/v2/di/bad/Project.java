package org.cleancode.notes.v2.di.bad;

public class Project {
    BackendDeveloper backendDeveloper;
    FrontendDeveloper frontendDeveloper;

    public Project(BackendDeveloper backendDeveloper, FrontendDeveloper frontendDeveloper) {
        this.backendDeveloper = backendDeveloper;
        this.frontendDeveloper = frontendDeveloper;
    }

    public void implementFuture(){
        backendDeveloper.writeJavaCode();
        frontendDeveloper.writeJavaScrip();
    }
}
