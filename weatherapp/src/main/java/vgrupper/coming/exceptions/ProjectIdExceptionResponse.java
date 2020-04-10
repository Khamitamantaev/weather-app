package vgrupper.coming.exceptions;

public class ProjectIdExceptionResponse {

    private String name;

    public ProjectIdExceptionResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }
}
