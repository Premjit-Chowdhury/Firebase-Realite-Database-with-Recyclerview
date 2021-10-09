package com.example.demofirebasetorecycler;

public class model
{
  String name,course,email;
    model()
    {

    }
    public model(String name, String course, String email) {
        this.name = name;
        this.course = course;
        this.email = email;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
